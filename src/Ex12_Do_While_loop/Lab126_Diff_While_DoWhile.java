package Ex12_Do_While_loop;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args){
        int a =0;
        while(a<0){
            System.out.println(a);
            a++;
        }

        do {
            System.out.println("Body!");
            System.out.println(a);
            a++;
        }while(a<0); // false condition, still code will be executed once

    }
}

// here do while block will give atleast one result
// but while block has nothing as output

// use case of do while :- even if the condition fulfills, still i have to call a function or close a file
// in web automation for open or close a file atleast once.
