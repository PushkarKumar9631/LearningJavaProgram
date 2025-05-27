package Ex13_Functions;

import java.util.Scanner;

public class Lab134_Function_arith {

    // Create a function of sub, sum, mul and division
    // with parameter, a,b,(take the parameter from user)

    // Logic Building
    // step 1: input and outputs
        // a, b - int - scanner
        // int -> variable result
    // step 2 : rough logic --> create functions
        // with return and with parameters function

    // step 3 : write code and find and fix edge cases

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get input a
            System.out.print("Enter the first number (int): ");
            int a = getValidInt(scanner);

            // Get input b
            System.out.print("Enter the second number (int): ");
            int b = getValidInt(scanner);

            // Perform operations
            System.out.println("----- Results -----");
            System.out.println("Sum: " + sum(a, b));
            System.out.println("Subtraction: " + subtract(a, b));
            System.out.println("Multiplication: " + multiply(a, b));

            // Handle division carefully
            if (b != 0) {
                System.out.println("Division: " + divide(a, b));
            } else {
                System.out.println("Division: ❌ Cannot divide by zero");
            }
        }

        // Input validation function
        private static int getValidInt(Scanner scanner) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("❌ Invalid input. Please enter an integer.");
                System.exit(0);
                return 0; // Required for compilation
            }
        }

        // Arithmetic Functions
        static int sum(int a, int b) {
            return a + b;
        }

        static int subtract(int a, int b) {
            return a - b;
        }

        static int multiply(int a, int b) {
            return a * b;
        }

        static float divide(int a, int b) {
            return (float) a / b;
        }
    }