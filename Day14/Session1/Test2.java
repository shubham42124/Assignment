    import java.util.Scanner;

   public class Test2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number:");
	int a = sc.nextInt();
	System.out.println("Enter second number:");
	int b = sc.nextInt();
	
	try {
	int c = a/b;
	System.out.println("divion of two number is: "+c);
	}
	catch(ArithmeticException e){
		System.out.println(e);

	}
    }
 }
