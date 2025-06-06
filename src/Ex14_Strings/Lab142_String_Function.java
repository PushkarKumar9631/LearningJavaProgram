package Ex14_Strings;

public class Lab142_String_Function {
    public static void main(String[] args){
        //        String s1="HELLO"; // SCP
        //        String s2= new String("world"); // OA

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //True
        System.out.println(str1 == str3); // False
        System.out.println(str1.equals(str3)); //True

        System.out.println(str1.concat(str3)); // HelloHello


    }
}
