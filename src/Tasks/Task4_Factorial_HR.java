package Tasks;

import java.util.Scanner;

public class Task4_Factorial_HR {
    public static void main(String[] args){
        System.out.println("Enter an Int number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int fact = 1;
        if (n==0){
            fact = 1;
        }
        for (int i = 1; i <= n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}


// Factorial can never be find for numbers lesser than 0 and 0,
// the factorial for will be always 1 for 0 and negative numbers