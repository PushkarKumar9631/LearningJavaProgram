package Ex13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args){

        non_return_type_func();
        int value = return_type_func();
        System.out.println(value);
    }
        // user defined functions
        // Step 1: Define Function
        // Step 2 : Calling the function

    // non return type function doesnot return anything
    static void non_return_type_func(){
        System.out.println("Hi, Non Return Type");
    }
    // return type function will return any particular data type
    static int return_type_func(){
        System.out.println("Hi, Return Type");
        return 10;
    }
}
