class Car {
    String model;
    int year;

    void setDetails(String model, int year) {
        this.model = model;   // using 'this' to refer to instance variables
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        // Declaring object reference variable
        Car car1;

        // Creating an object and assigning it to reference variable
        car1 = new Car();

        // Setting values using method
        car1.setDetails("Suzuki Swift", 2020);

        // Displaying object data
        car1.displayInfo();

        // Assigning one reference variable to another
        Car car2 = car1;

        // Display using second reference (both point to same object)
        car2.displayInfo();
    }
}
