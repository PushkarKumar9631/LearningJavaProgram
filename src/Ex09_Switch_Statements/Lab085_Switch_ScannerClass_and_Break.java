package Ex09_Switch_Statements;

import java.util.Scanner;

public class Lab085_Switch_ScannerClass_and_Break {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7
        // and if user enters 1 to 7
        // you will tell which day it is.

        // Logic Building
        /**
         * Step 1: Use scanner class for user input
         * Step 2: figure out the expression and the day
         * Step 3: We will basically add step 3 as rough logic
         * Step 4: We will write and fix the logic and optimize code
         * step 5: Figure out the edge cases
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");

        if (scanner.hasNextInt()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter an Integer Number from 1 to 7, you fool!");
            }
        }else{
            System.out.println("You are mad, why you are entering non int values");
        }
    }
}
