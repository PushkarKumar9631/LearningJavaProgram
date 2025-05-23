package Ex01_JavaBasicsPart1;

public class _OnlyUnderscorenotallowed {
    public static void main(String[] args) {
        System.out.println("print");
    }
}

/**
 * Reason: Reserved for Future Use
 * The underscore (_) has been reserved as a keyword in Java 9 and later versions to enable future language enhancements. This means:
 *
 * You cannot use _ as a variable, method, or class name.
 *
 * This change was introduced to avoid confusion and increase code clarity.
 *
 * 🧑‍💻 Before Java 9:
 * You could do this:
 *
 * java
 * Copy
 * Edit
 * int _ = 10;
 * System.out.println(_);
 * 🚫 Since Java 9:
 * This will now give a compile-time error:
 *
 * java
 * Copy
 * Edit
 * error: as of release 9, '_' is a keyword, and may not be used as an identifier
 * ✅ What is still allowed:
 * You can use _ as part of an identifier, but not alone:
 *
 * java
 * Copy
 * Edit
 * int _value = 10;  // ✅ allowed
 * int value_ = 20;  // ✅ allowed
 * int __ = 30;      // ✅ allowed
 * int _ = 5;        // ❌ NOT allowed in Java 9+
 * 📘 Reference: Java Enhancement Proposal
 * This change was part of JEP 213: Milling Project Coin.
 *
 * It aims to reserve _ for possible use in pattern matching or other language features in future Java versions.
 *
 * ✅ Summary:
 * Version	Use of _ as identifier
 * Java 8 and earlier	✅ Allowed
 * Java 9 and later	❌ Not Allowed (Reserved Keyword)
 *
 * If you're writing code for Java 9 or later, avoid using _ as a variable name. Use meaningful names or combine it with other characters (like _var, __temp, etc.).
 *
 * Would you like a list of other such changes introduced in Java 9?
 */
