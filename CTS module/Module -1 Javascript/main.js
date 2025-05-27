
console.log("Welcome to the Community Portal");
window.onload = () => {
  alert("Page fully loaded!");
  renderEvents();
};


const event1 = {
  name: "Music Night",
  date: "2025-06-15",
  category: "Music",
  seats: 5,
};

const event2 = {
  name: "Art Exhibition",
  date: "2025-06-10",
  category: "Art",
  seats: 0,
};

const event3 = {
  name: "Tech Meetup",
  date: "2025-06-20",
  category: "Technology",
  seats: 10,
};

let events = [event1, event2, event3];


function isValidEvent(event) {
  const today = new Date();
  const eventDate = new Date(event.date);
  return eventDate >= today && event.seats > 0;
}


function renderEvents() {
  const container = document.getElementById("events-container");
  container.innerHTML = "";

  events.forEach((event, index) => {
    try {
      if (isValidEvent(event)) {
        const card = document.createElement("div");
        card.className = "event-card";
        card.innerHTML = `
          <h3>${event.name}</h3>
          <p>Date: ${event.date}</p>
          <p>Seats Left: ${event.seats}</p>
          <p>Category: ${event.category}</p>
          <button onclick="registerUser(${index})">Register</button>
        `;
        container.appendChild(card);
      }
    } catch (err) {
      console.error("Error rendering event:", err);
    }
  });
}


function registerUser(index) {
  try {
    if (events[index].seats > 0) {
      events[index].seats--;
      alert(`Successfully registered for ${events[index].name}`);
    } else {
      alert("Sorry, no seats left!");
    }
    renderEvents(); 
  } catch (e) {
    console.error("Registration failed:", e);
  }
}

function registrationTracker() {
  let count = 0;
  return function () {
    count++;
    console.log(`Total registrations in this category: ${count}`);
  };
}

const musicRegisterCounter = registrationTracker(); // Could be tied to categories
