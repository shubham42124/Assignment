interface info{
	public void display();
}
public class Lamda {
	public static void main(String[] args) {
	int a=20;
 info f =()->System.out.println(a);
 f.display();
 System.out.println("Values using Block Lambda ---");
	info f1=()->{
		for(int i=0;i<2;i++) {
		System.out.println(i);
	}
	};
	f1.display();

	
}
}
