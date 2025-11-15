class Cylinder {
    private double radius;
    private double height;

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        // Setting values
        c.setRadius(5.5);
        c.setHeight(10.2);

        // Getting and printing values
        System.out.println("Cylinder Radius: " + c.getRadius());
        System.out.println("Cylinder Height: " + c.getHeight());
    }
}
