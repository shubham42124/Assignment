import java.util.ArrayList;
import java.util.function.Predicate; 

class Emp{
	String ename;
	int esalary;
	public Emp(String ename, int esalary) {
		this.ename=ename;
		this.esalary=esalary;
	}
	public String toString() {
		return ename+" "+esalary;
	}
}

public class Employee {
	public static void main(String[] args) {
		ArrayList<Emp> ar=new ArrayList<Emp>();
		ar.add(new Emp("shubham",4000));
		ar.add(new Emp("ravi",500));
		ar.add(new Emp("Manish",1000));
		ar.add(new Emp("rutvi",50000));
		//System.out.println(ar);
		
		for(Emp e:ar) {
			Predicate<Emp> p =s->e.esalary>7000;
			System.out.println(p.test(e));
		}
	}

}
