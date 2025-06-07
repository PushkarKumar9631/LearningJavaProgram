package Ex18_OOPS_Constructors;

public class Lab162_Oops {
    public static void main(String [] args){
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;

    }
}

class Baby{
    String name;

    // Default Constructor also called
    Baby(){
        System.out.println("I am Called, Object Created");

    }

}