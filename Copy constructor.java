class Car {
    String model;
    int year;

    Car(String model, int year) {   // Parameterized constructor
        this.model = model;
        this.year = year;
    }

    Car(Car c) {   // Copy constructor
        model = c.model;
        year = c.year;
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Honda City", 2022); // Original object
        Car c2 = new Car(c1);                // Copy object

        System.out.println("Original Car:");
        System.out.println("Model: " + c1.model + ", Year: " + c1.year);

        System.out.println("\nCopied Car:");
        System.out.println("Model: " + c2.model + ", Year: " + c2.year);
    }
}
