package Ex17_OOPS;

public class Lab160 {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name = "Pushkar Kumar";
        System.out.println(s1.name);
        // 1. STudent - CLass Loading
        // 2. S1 -- object ref.
        // 3. new Student() -> Object creation
    }

}

class Student{
    String name;
    int roll;

    void sleep(){}
}