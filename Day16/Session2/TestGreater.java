import java.util.function.Predicate;

public class TestGreater {
 
    public static void main(String[] args) {
 

        Predicate<String> p = i -> i.length()>6 ;
 
      
        System.out.println("1. Whether String is grater than 6 :-" + p.test("Shubham"));
 
        System.out.println("2. Whether String is grater than 6 :- " + p.test("Aman"));
 
        System.out.println("3.Whether String is grater than 6 : " + p.test("Manish"));
 
        System.out.println("4. Whether String is grater than 6 : " + p.test("Rupanshu"));
 
        System.out.println("5. Whether String is grater than 6  :" + p.test("Rutvi"));
    }
}
