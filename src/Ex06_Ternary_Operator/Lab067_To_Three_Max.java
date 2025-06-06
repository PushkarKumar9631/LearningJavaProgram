package Ex06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args){

        // find maximum between three number

        int n1 = 55;
        int n2 = 9;
        int n3 = 110;

        int result = n1>n2 ? (n1>n3 ? n1 : n3) : (n2>n3 ? n2 : n3);
        System.out.println(result);

    }
}
