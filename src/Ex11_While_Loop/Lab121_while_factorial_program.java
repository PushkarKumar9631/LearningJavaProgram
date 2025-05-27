package Ex11_While_Loop;


import java.util.Scanner;

public class Lab121_while_factorial_program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Taking input from user using scanner class and storing it in scanner object
        System.out.println("Welcome to Factorial Program");
        System.out.println("Enter the number, whose factorial you want!");


        if (!scanner.hasNextInt()) { //checking input value is integer or not
            System.out.println("Enter the Int, rerun the program");
        }



        int number = scanner.nextInt(); //storing scanner value in number object
        int factorial = 1; // defined factorial object with its data type and initial value as 1

        // Additional check for valid factorial range within int
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        } else if (number > 12) {
            System.out.println("Input too large! Factorial exceeds the int limit. Please enter number ≤ 12.");
            return;
        }
        // we need to take care that not only input the output should not also exceed the data type limit, which will cause 0 as output


        if (number <= 0) { // if input number is 0 or lesser in negative, factorial will be 1 by this if logic
            System.out.println("Factorial is --> " + factorial);
        } else {

            int i = 1;
            while (i < number) { // if input number is greater than 1 then this while loop will run and find the value of factorial
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial is --> " + factorial);

        }
    }
}


//no output