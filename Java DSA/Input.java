import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first input (next): ");
        String input1 = scan.next();
        System.out.println(".next() -> " + input1);

        scan.nextLine(); // To consume the newline character left by .next()

        System.out.print("Enter second input (nextLine): ");
        String input2 = scan.nextLine();
        System.out.println(".nextLine() -> " + input2);

        System.out.print("Enter third integer input (nextInt): ");
        int num = scan.nextInt();
        System.out.println(".nextInt() -> " + num);
        scan.close(); // Closing scanner to prevent resource leak
    }
}

/* LEARNING :

nextFloat() → Accepts a floating-point number (requires f suffix for explicit declaration)

nextDouble() → Accepts a double-precision floating-point number

Character Inputs:
next().charAt(0) → Retrieves first character from input

Boolean Inputs:
nextBoolean() → Accepts true or false

Common Input Errors & Solutions
1️⃣ Mixing next() and nextLine()
When you use .next(), it leaves a newline (\n) in the buffer. If you immediately call .nextLine(), it might consume this leftover newline instead of waiting for fresh input.
✅ Fix: Add an extra .nextLine(); after .next()

2️⃣ Mismatched Data Types (InputMismatchException)
If you use .nextInt() but enter non-numeric data, Java throws an InputMismatchException.
✅ Fix: Use scan.nextLine() and Integer.parseInt()

String input = scan.nextLine();
try {
    int num = Integer.parseInt(input);
    System.out.println("Valid integer: " + num);
} catch (NumberFormatException e) {
    System.out.println("Error: Input is not an integer!");
}

✅ Always close the Scanner → scan.close(); ✅ Use .nextLine() after any nextInt(), nextFloat() to avoid skipping inputs ✅ Handle exceptions using try-catch to prevent program crashes
*/