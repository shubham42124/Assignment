class MyException extends Exception{ //Object--11
	
	private int age;
	
	public MyException(int age) {
		this.age=age;
	}
	
	public String toString() {
		return "you are not aligeble for vote";
	}
	
}
public class Test4 {

	  static  void validation(int age) throws MyException {
	    	if (age<18)
	    		throw new MyException(age);
	    	else
	    		System.out.println("you are eleible for vote"+age);
	    }
	public static void main(String[] args) throws MyException {
		
		Test5.validation(12);
		System.out.println("rest of the code");
		
		
		
		
		
	}
}
