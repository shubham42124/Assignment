public class Test5 {
	
	public void pass(int marks) {
		
		if (marks<35)
			throw new ArithmeticException("you are failed");
		
		else
		{
			System.out.println("you are passed:"+marks);
		}
	}
public static void main(String[] args) {
	
	ThrowEx t= new ThrowEx();
	t.pass(12);
	System.out.println("welcome");
	
	
}
}
