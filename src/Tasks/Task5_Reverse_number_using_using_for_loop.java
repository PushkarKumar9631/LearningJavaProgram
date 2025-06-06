package Tasks;

public class Task5_Reverse_number_using_using_for_loop {
    public static void main(String[] args){
        int[] number = {1,2,3,4,5};
        for (int i = number.length-1; i >= 0 ; i--){
            System.out.print(number[i]);
        }

    }

}

// always rember operator >= and <= written in this way other wise it will give an error saying illegal expression
// eqaul operator always written after < or >
