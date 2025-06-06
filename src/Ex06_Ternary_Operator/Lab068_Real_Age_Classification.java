package Ex06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args){
        // age = 23 --> Adult (age> 18), minor (age<18), senior (age>65)
        // String user_input = args[0]; // for taking inputs from command line
//        int age = Integer.parseInt(user_input); // converting to integer
        int age = 20;
        String result = age>18 ? (age>65 ? "senior citizen" : "adult") : "minor";
        System.out.println(result);

    }
}
