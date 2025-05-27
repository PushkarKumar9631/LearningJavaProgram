package Ex13_Functions;

public class Lab131_User_defined_one {
    public static void main(String[] args){
        int r1 = sum_of_two_numbers(2,7);
        int r2 = sum_of_two_numbers(45,45);

        System.out.println(r1);
        System.out.println(r2);

    }
    static int sum_of_two_numbers(int first, int second){
        return first+second;
    }

}
