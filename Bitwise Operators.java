import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Bitwise operations
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;

        // Display results in binary
        System.out.println("\n--- Bitwise Operation Results ---");
        System.out.println("a (binary)   = " + Integer.toBinaryString(a));
        System.out.println("b (binary)   = " + Integer.toBinaryString(b));
        System.out.println("a & b        = " + andResult + " (binary: " + Integer.toBinaryString(andResult) + ")");
        System.out.println("a | b        = " + orResult + " (binary: " + Integer.toBinaryString(orResult) + ")");
        System.out.println("a ^ b        = " + xorResult + " (binary: " + Integer.toBinaryString(xorResult) + ")");

        sc.close();
    }
}
