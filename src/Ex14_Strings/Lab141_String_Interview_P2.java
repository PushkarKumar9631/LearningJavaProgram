package Ex14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args){

        String s1 = "Hello";
        String s4 = "Hello";


        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparision -> String => this check the ref location or address
        //  this will only give tru when both address are same

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);


        System.out.println(s1==s4);
        System.out.println(s3==s5);

        // equals (content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value


    }
}


/** EXPLAINATION:-
 * Step 1: Strings kaise banaye gaye aur memory mein kahan store hue?
 * Sabse pehle, har String variable kaise banaya gaya aur JVM memory mein kahan gaya, ye samajhte hain:
 * String s1 = "Hello";
 * Ye ek String literal hai.
 * JVM pehle [[String Constant Pool (SCP)]] mein check karega ki "Hello" naam ka koi String object pehle se hai kya. Agar nahi hai, to ek naya "Hello" object SCP mein banayega aur s1 usko point karega.
 * Let's say iska memory address Address_SCP_Hello hai.
 * String s4 = "Hello";
 * Ye bhi ek String literal hai jisme value "Hello" hai.
 * JVM phir se SCP mein check karega. "Hello" pehle se Address_SCP_Hello par موجود hai.
 * To, JVM naya object nahi banayega, balki s4 ko bhi Address_SCP_Hello ko hi point karwa dega.
 * Memory Optimization!
 * String s2 = new String("Hello");
 * Yahan new operator ka use kiya gaya hai.
 * new operator hamesha Heap ke [[Object Area (Heap)]] mein ek naya object banata hai, bhale hi value SCP mein ya kahin aur pehle se ho.
 * So, ek naya "Hello" object Heap mein banega.
 * Let's say iska memory address Address_Heap_Hello_1 hai.
 * (Side Note: new String("Hello") internally SCP mein "Hello" literal bhi banata hai agar wo wahan nahi hai, lekin s2 Variable Heap wale object ko point karta hai).
 * String s3 = new String("Hello");
 * Phir se new operator.
 * Isse Heap ke Object Area mein ek aur naya "Hello" object banega, s2 se bilkul alag.
 * Let's say iska memory address Address_Heap_Hello_2 hai.
 * String s5 = new String("hello");
 * new operator ka use.
 * Heap ke Object Area mein ek naya "hello" object banega (lower case 'h').
 * Let's say iska memory address Address_Heap_hello_1 hai.
 * Step 2: == Operator ke Results ko Samjho (Reference Comparison)
 * == operator do variables ke references (memory addresses) ko compare karta hai. Agar references same memory location ko point kar rahe hain, to true deta hai, warna false.
 * System.out.println(s1 == s3);
 * s1 points to Address_SCP_Hello
 * s3 points to Address_Heap_Hello_2
 * Output: false
 * Kyu? Dono alag-alag memory locations ko point kar rahe hain – ek SCP mein hai aur doosra Heap mein. Content same hone par bhi, references alag hain.
 * System.out.println(s1 == s2);
 * s1 points to Address_SCP_Hello
 * s2 points to Address_Heap_Hello_1
 * Output: false
 * Kyu? Same reason as above. SCP aur Heap mein alag-alag objects hain.
 * System.out.println(s2 == s3);
 * s2 points to Address_Heap_Hello_1
 * s3 points to Address_Heap_Hello_2
 * Output: false
 * Kyu? Bhale hi dono new String("Hello") se bane hain aur content same hai, new operator hamesha naye objects banata hai. Isliye, ye Heap mein do alag-alag objects hain.
 * System.out.println(s1 == s4);
 * s1 points to Address_SCP_Hello
 * s4 points to Address_SCP_Hello (SCP ne "Hello" ko reuse kiya)
 * Output: true
 * Kyu? Dono variables SCP mein ek hi "Hello" object ko point kar rahe hain. Ye SCP ki memory optimization ka direct example hai.
 * System.out.println(s3 == s5);
 * s3 points to Address_Heap_Hello_2 ("Hello")
 * s5 points to Address_Heap_hello_1 ("hello")
 * Output: false
 * Kyu? Content hi alag hai ("Hello" vs "hello"), to memory locations to alag hongi hi.
 * [!WARNING] Takeaway for ==: == operator Strings ke references (memory addresses) ko compare karta hai. Ye check karne ke liye use na karein ki do Strings ka content same hai ya nahi.
 * Step 3: equals() aur equalsIgnoreCase() ke Results ko Samjho (Content Comparison)
 * equals() method Strings ke content (characters ki sequence) ko compare karta hai. equalsIgnoreCase() bhi content compare karta hai, lekin case (uppercase/lowercase) ko ignore karta hai.
 * System.out.println(s1.equals(s2));
 * s1 ka content: "Hello"
 * s2 ka content: "Hello"
 * Output: true
 * Kyu? Dono Strings ka content bilkul same hai, aur equals() content hi compare karta hai. Isse farak nahi padta ki wo SCP mein hai ya Heap mein.
 * System.out.println(s1.equals(s3));
 * s1 ka content: "Hello"
 * s3 ka content: "Hello"
 * Output: true
 * Kyu? Dono Strings ka content same hai.
 * System.out.println(s1.equals(s5));
 * s1 ka content: "Hello"
 * s5 ka content: "hello"
 * Output: false
 * Kyu? equals() case-sensitive hota hai. "H" aur "h" alag-alag characters hain.
 * System.out.println(s1.equalsIgnoreCase(s5));
 * s1 ka content: "Hello"
 * s5 ka content: "hello"
 * Output: true
 * Kyu? equalsIgnoreCase() case ko ignore karta hai. Isliye, "Hello" aur "hello" ko ye same content maanega.
 * [!INFO] Takeaway for equals() and equalsIgnoreCase(): Ye methods Strings ke actual content ko compare karte hain. Hamesha equals() ya equalsIgnoreCase() ka use karein jab aapko do Strings ki values compare karni ho.
 */