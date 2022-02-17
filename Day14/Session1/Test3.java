import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
	try {
		
	int a[]= new int[5];//0...4
	a[4]=30/2;
	String s= "100";
	System.out.println(s.length());
	int x= Integer.parseInt(s);
	System.out.println("no error  "+a[4]+"  "+x);
	
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("please enter valid index");
	}
	catch(ArithmeticException ae) {
		System.out.println("dont enter denominotor as zero");
	}
	catch (NumberFormatException e) {
	System.out.println("we cant convert String to number");
	}
	catch(Exception ae) {
		System.out.println("unable to find length of the String");
	}
	finally {
		System.out.println("executes every time to close the connection");
	}
	System.out.println("remaining 1000 lines of code");
}
}
