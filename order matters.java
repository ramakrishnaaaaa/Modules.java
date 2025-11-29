public class Demo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
        }
        catch (Exception e) {   
            // This block catches ALL exceptions including ArithmeticException
            System.out.println("General error.");
        }
        catch (ArithmeticException e) {   // Unreachable code
            System.out.println("Divide by zero.");
        }
    }
}
