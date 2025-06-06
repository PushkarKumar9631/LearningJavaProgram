package Ex06_Ternary_Operator;

public class Lab065_To_Interview_Max_Two_TO {
    public static void main(String[] args){
        // find the maximum number between two number.

        int x = 10;
        int y = 20;

        System.out.println(Math.max(x,y)); // this is inbuilt function
        int max = x > y ? x : y;
        System.out.println(max);
    }
}
