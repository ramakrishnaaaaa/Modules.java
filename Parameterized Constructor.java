class Car {
    String model;
    int year;

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects (declaring + instantiating)
        Car car1 = new Car("Honda City", 2020);  
        Car car2 = new Car("Swift", 2018);

        // Assigning object reference variable
        Car car3 = car1;   // car3 now refers to the same object as car1

        // Printing values
        System.out.println("Car 1: " + car1.model + ", " + car1.year);
        System.out.println("Car 2: " + car2.model + ", " + car2.year);
        System.out.println("Car 3 (same as Car 1): " + car3.model + ", " + car3.year);
    }
}
