package Ex17_OOPS;

public class Lab161_Cats {
    public static void main (String[] args){
        Cat c1 = new Cat();
        Cat c2 = null;
        new Cat();

        c1.running();
//        c2.running(); // Exception in thread "main" java.lang.NullPointerException


    }

}


class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}