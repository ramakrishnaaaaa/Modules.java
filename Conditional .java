import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Ternary operator to check even or odd
        String result = (num % 2 == 0) ? "Even" : "Odd";

        // Output result
        System.out.println("The number is: " + result);

        sc.close();
    }
}
