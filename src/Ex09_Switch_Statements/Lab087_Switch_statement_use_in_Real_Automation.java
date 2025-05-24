package Ex09_Switch_Statements;


import java.util.Scanner;

public class Lab087_Switch_statement_use_in_Real_Automation {
    public static void main(String[] args) {
        //string browser = args[0] //we can use this for getting input from command line arguments

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        browser = browser.toLowerCase(); //lower case the input value

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("............");
                System.out.println("TC2");
                System.out.println("TC3");
                break;

            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("............");
                System.out.println("TC2");
                System.out.println("TC3");

            default:
                System.out.println("I have no idea which browser is this");
                break;



        }
    }
}

