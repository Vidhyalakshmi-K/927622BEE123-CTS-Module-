 public class CarDemo {
   
    static class Car {
      
        String make;
        String model;
        int year;

        
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayDetails() {
            System.out.println("Car Make: " + make);
            System.out.println("Car Model: " + model);
            System.out.println("Car Year: " + year);
        }
    }


    public static void main(String[] args) {
      
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2020);

      
        System.out.println("Details of Car 1:");
        car1.displayDetails();

        System.out.println("\nDetails of Car 2:");
        car2.displayDetails();
    }
}
  

