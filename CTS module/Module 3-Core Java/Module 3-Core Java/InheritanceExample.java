
class Animal {
   
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
  
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        System.out.print("Animal says: ");
        genericAnimal.makeSound();
        Dog dog = new Dog();
        System.out.print("Dog says: ");
        dog.makeSound();
    }
}
