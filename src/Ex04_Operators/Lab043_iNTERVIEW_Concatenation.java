package Ex04_Operators;

public class Lab043_iNTERVIEW_Concatenation {
    public static void main(String[] args) {

        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // // output: PramodDutta1010
        System.out.println(a + b + first_name + last_name); // output: 20PramodDutta

        System.out.println(first_name + last_name + (a + b)); // output: PramodDutta20

        // BODMAS - Bracket of Div, mul, add, sub






    }
}