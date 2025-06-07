package Ex18_OOPS_Constructors;

public class Car2 {

    String model;
    int year;

    Car2(){
        model = "XXXX";
        year = 1909;
        System.out.println("Default Constructor");

    }

    Car2(String model_name, int year_created){
        this.model = model_name;
        this.year = year_created;
    }

    Car2(String model_name){
        this.model = model_name;
    }

}
