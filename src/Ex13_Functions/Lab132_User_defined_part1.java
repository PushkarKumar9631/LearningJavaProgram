package Ex13_Functions;

import java.util.Scanner;

public class Lab132_User_defined_part1 {
    public static void main(String[] args){
        // There are four Types of User Defined Functions
        //1. Without Parameters and Without Return Type
        wp_wr_greet();


        //2. Without parameters but with return type

        String r1 = greet_with_helo_wp_with_rp();
        System.out.println(r1);

        //3. With Parameters and without return type

        greet_with_details("Pramod", 65, 200000);
        greet_with_details("Pushkar", 26, 800000);
// we can do this using user input as well
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.next();
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        System.out.println("Enter your Salary ");
        double salary = scanner.nextDouble();

        greet_with_details(name, age, salary);




        //4. With Parameters and with return type
        int r2 = sum_of_two_numbers(2,3);
        float r3 = division_of_two_numbers(5,2);
        System.out.println(r2);
        System.out.println(r3);

    }
    //1. Without Parameters and Without Return Type
    static void wp_wr_greet(){
        System.out.println("Hi, How are you!");
    }

    //2. Without parameters but with return type
    static String greet_with_helo_wp_with_rp(){
        System.out.println("Hi");
        return "Hello!";
    }

    //3. With Parameters and without return type

    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is "+name+"\nyour age is "+age+"\nyour salary is "+salary);
    }

    //4. With Parameters and with return type

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static float division_of_two_numbers(int a, int b){
        return (float) a/b;
    }


}
