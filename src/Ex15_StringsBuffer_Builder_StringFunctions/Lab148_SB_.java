package Ex15_StringsBuffer_Builder_StringFunctions;

public class Lab148_SB_ {
    public static void main(String[] args) {

       StringBuffer sb = new StringBuffer("Java");
       sb.append(" Programming");
       System.out.println(sb);

       //        sb.delete(5,16); // Delete the substring
        //        System.out.println(sb);

        sb.replace(0,4, "C++");
        System.out.println(sb);

    }
}
