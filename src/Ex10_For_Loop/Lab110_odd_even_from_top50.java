package Ex10_For_Loop;

public class Lab110_odd_even_from_top50 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even-> "+i);
            }
        }
    }
}
