package Ex14_Strings;

public class Lab135_String_Immutability {
    public static void main(String[] args){
        String name = "Pushkar"; // SCP
        String name2 = name.toUpperCase(); // this operation has been done but not stored
        System.out.println(name); //output : Pushkar
        System.out.println(name2); // Output: PUSHKAR
    }
}
