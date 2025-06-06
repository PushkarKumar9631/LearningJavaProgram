package Ex06_Ternary_Operator;

public class Lab063_Ternary_Operator_Part1 {
    public static void main(String[] args){
        int number = 5;
        String result = number > 0 ? "Positive" : "Negative";
//        int result = number > 0 ? "Positive" : "Negative"; // this will throw error,
//        cause output is string
        System.out.println(result);


    }
}
