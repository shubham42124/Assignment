interface add {
	int addition(int a,int b);
}
public class Addable {
	public static void main(String args[])
	{
		add ar=(a,b)->(a+b);{
			System.out.print(ar.addition(10,20));
		}
	}

}
