package Ex19_Opps_Inheritance.inheritance.Singleinheritance;

public class Lab168_SI {
    public static void main(String[] args){

        Son pushkar = new Son();
        System.out.println(pushkar.gold_f);
        pushkar.bhk2();
        pushkar.bhk3();

        Cousin c = new Cousin();
//        c.bhk3(); // cannot access father

        c.bhk31(); // inherited cousins

    }
}
