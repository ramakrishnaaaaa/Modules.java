class Car {
    String model;
    int year;

    // Default constructor
    Car() {
        model = "Unknown";
        year = 2020;
    }
}

public class Main {
    public static void main(String[] args) {

        // Declaring object reference variable
        Car car1;

        // Assigning object reference by creating object
        car1 = new Car();

        // Accessing object fields
        System.out.println("Car 1 Model: " + car1.model);
        System.out.println("Car 1 Year : " + car1.year);

        // Creating and assigning another object
        Car car2 = new Car();

        // Changing values
        car2.model = "Toyota";
        car2.year = 2022;

        System.out.println("\nCar 2 Model: " + car2.model);
        System.out.println("Car 2 Year : " + car2.year);

        // Assigning one object reference to another
        Car car3 = car2;

        System.out.println("\nCar 3 Model (same as car2): " + car3.model);
        System.out.println("Car 3 Year  (same as car2): " + car3.year);
    }
}
