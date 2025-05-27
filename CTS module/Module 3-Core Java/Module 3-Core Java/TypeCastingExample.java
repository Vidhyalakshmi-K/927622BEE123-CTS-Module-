public class TypeCastingExample {
    public static void main(String[] args) {
        // Declare a double variable with a decimal value
        double myDouble = 9.78;

        // Cast double to int (explicit casting)
        int castedInt = (int) myDouble;
        System.out.println("Double value: " + myDouble);
        System.out.println("Casted to int: " + castedInt);

       
        int myInt = 42;

      
        double castedDouble = myInt;
        System.out.println("Int value: " + myInt);
        System.out.println("Casted to double: " + castedDouble);
    }
}
