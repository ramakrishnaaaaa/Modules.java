class Car {
    String model;
    int year;

    Car() {   // Default constructor
        model = "Unknown";
        year = 2020;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();   // Object created using default constructor

        System.out.println("Car Model: " + c1.model);
        System.out.println("Car Year : " + c1.year);
    }
}
