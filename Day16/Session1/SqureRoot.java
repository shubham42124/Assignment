interface squre{
	public void root();
}
public class SqureRoot {
	public static void main(String args[])
	{
		int s=25;
		squre sq=()->System.out.println(Math.sqrt(s));
		sq.root();
	}

}
