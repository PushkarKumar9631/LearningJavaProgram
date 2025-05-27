package Ex12_Do_While_loop;

public class Lab125_DoWhile {
    public static void main(String[] args){
        int a =1;
        do {
            System.out.println("Body!");
            System.out.println(a);
            a++;
        }while(a>10); // false condition, still code will be executed once

    }
}
