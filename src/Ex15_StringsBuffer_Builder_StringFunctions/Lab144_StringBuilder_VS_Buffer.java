package Ex15_StringsBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_VS_Buffer {
    public static void main(String[] args) {

        String s0 = "Pushkar";
        String s1 = new String("Pushkar");

        //less than <10% used.

        StringBuffer stringBuffer = new StringBuffer("Pushkar");
        StringBuilder stringBuilder = new StringBuilder("Pushkar");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
