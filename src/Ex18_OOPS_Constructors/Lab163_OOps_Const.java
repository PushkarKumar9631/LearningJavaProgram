package Ex18_OOPS_Constructors;

public class Lab163_OOps_Const {
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1); // this will print ref

    }
}

class A{
    A(){
        System.out.println("I want to read a CSV file");
        System.out.println("OPen the page before");
        System.out.println("You can do anything which you want to do, When Object is created");
//        FileInputStram fileinputstream = new FileInputStream("C://a.txt");
    }
}