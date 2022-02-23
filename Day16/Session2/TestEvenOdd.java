import java.util.function.Predicate;

public class TestEvenOdd {
 
    public static void main(String[] args) {
 

        Predicate<Integer> p = i -> i%2 == 0;
 
    
        System.out.println("1. Whether number 10 is even/odd \t: " + p.test(10));
 
        System.out.println("2. Whether number 5 is even/odd \t: " + p.test(5));
 
        System.out.println("3. Whether number 1992 is even/odd \t: " + p.test(1992));
 
        System.out.println("4. Whether number 9753 is even/odd \t: " + p.test(9753));
 
        System.out.println("5. Whether number 2020 is even/odd \t: " + p.test(10));
    }
}
