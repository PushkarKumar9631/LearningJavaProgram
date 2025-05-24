package Ex09_Switch_Statements;

public class Lab094_JDK13Above_we_can_give_multiple_values_in_cases {
    public static void main(String[] args){
        int itemCode = 005;
        switch (itemCode){
            case 001, 004, 005 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");


        }
    }
}

// we don't need break in this case, cause this is
// thnew type of switch which comes in JDK 13 and Above

// it will not work below version of jdk which is lesser than 13

// We can give multiple literals and values in JDK 13 and above
// in cases like -->  case 001, 004, 005 -> System.out.println("001");