package Ex06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args){
        // Nested Ternary
        // result = condition ? expression1 : (conditio2 ? expression 2 : expression 3);

        int age = 17;
        String result = age > 18 ? ( age > 25 ? "You can go to goa, You are allowed to Drink" : "You can go to goa, You are not allowed to Drink") : "Sorry! You can't Go";
        System.out.println(result);
    }
}
