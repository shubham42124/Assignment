public class Reference {
	String name="Shubham";
	void m1(Reference r) {
		r.name="Ravi";
		System.out.println(name);

	}
	public static void main(String[] args) {
		Reference r=new Reference();
		r.m1(r);
		
	}
}