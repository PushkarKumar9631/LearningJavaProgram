package Ex11_While_Loop;


import java.util.Random;
import java.util.Scanner;

public class Lab123_Guessing_game_Interview {
    public static void main(String[] args) {
        // guess a number between 1 and 100
        // n = 50
        // greater than 50
        // n = 70
        // less than 70
        // ..... until right match

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
//        System.out.println(numberToGuess); // no need to print this value

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");


        int attempts = 0;

        while (true){

            int number = scanner.nextInt();
            attempts++;

            if (numberToGuess>number){
                System.out.println("Number is Greater than the provided");
            }
            else if (numberToGuess<number){
                System.out.println("Number is lesser than the provided");
            }
            else if (numberToGuess==number){
                System.out.println("Hurrayyyy!! Matched in "+attempts+" Attempts");
                break;
            }

        }


    }
}


