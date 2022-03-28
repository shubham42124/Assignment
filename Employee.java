package CaseStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class client {
	public static void main(String[] args) {
		HashMap<Integer,Employee>employee=new HashMap<Integer,Employee>();
		int pid =100;
		while(true) {

			System.out.println("Employee managemant Application");
			System.out.println("1.Add Employee;");
			System.out.println("2.Update Employee");
			System.out.println("3.get Employee");
			System.out.println("4.get all Employee");
			System.out.println("5.Delete Employee");
			
			Scanner sc= new Scanner(System.in);
			
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter to add employee details");
				System.out.println("Enter employee name");
				       String pname=sc.next();
				System.out.println("Enter employee salary");
				       int psalary=sc.nextInt();
				System.out.println("Enter employee mail");
				     String pmail=sc.next();
				System.out.println("Enter employee address");
				       String padd=sc.next();
				System.out.println("Enter employee pincode");
				     int ppincode=sc.nextInt();
				  
				 Employee pd= new Employee(pname, psalary, pmail, padd, ppincode);
				 
				 employee.put(++pid, pd);
				 
				 System.out.println("Employee addedd succsfully :"+pid);
				     
				break;
	       case 2:
	    	   
	    	   System.out.println("Enter to Update the employee details");
	    	   
	    	   System.out.println("ENTER ID TO UPDATE");
	    	              int pid1=sc.nextInt();
	    	              System.out.println("Enter employee name");
					       String pname1=sc.next();
					System.out.println("Enter employee salary");
					       int psalary1=sc.nextInt();
					System.out.println("Enter employee mail");
					     String pmail1=sc.next();
					System.out.println("Enter employee address");
					       String padd1=sc.next();
					System.out.println("Enter employee pincode");
					     int ppincode1=sc.nextInt();
					  
					 Employee pd1= new Employee(pname1, psalary1, pmail1, padd1, ppincode1);
					 
					 employee.put(pid1, pd1);

				     
				     System.out.println("employee updated suscfully :"+pid1);
				break;
	       case 3:
	    	   System.out.println("Enter id to get the employee details");
	    	      int pid2=sc.nextInt();
	 
	    	      Employee pobj=employee.get(pid2);
	    	      System.out.println(pobj);
	    	      
				break;
	       case 4:
	    	   Set<Entry<Integer,Employee>> result=employee.entrySet();
	    	   Iterator<Entry<Integer,Employee>> itr=result.iterator();
	    	   
	    	   while(itr.hasNext()) {
	    		   Entry<Integer,Employee> finalResult=itr.next();
	    		   
	    		   System.out.println(finalResult.getKey()+"  "+finalResult.getValue());
	    		   
	    	   }
                  
				break;
	       case 5:
	    	   
	    	   System.out.println("Enter id to delete employee");
	    	   int pid3= sc.nextInt();
	    	   
	    	   Employee pobj1=employee.remove(pid3);
	    	   System.out.println("product deleted :"+pid3);
				
				break;
			
			
			default:
				System.out.println("wrong selection.....");
				
			
			}
			
			

		}
	}
}


public class Employee {
	private String pname; //
	private int psalary;
	private String pmail;
	private String paddrs;
	private int ppincode;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPsalary() {
		return psalary;
	}
	public void setPsalary(int psalary) {
		this.psalary = psalary;
	}
	public String getPmail() {
		return pmail;
	}
	public void setPmail(String pmail) {
		this.pmail = pmail;
	}
	public String getPaddrs() {
		return paddrs;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public int getPpincode() {
		return ppincode;
	}
	public void setPpincode(int ppincode) {
		this.ppincode = ppincode;
	}
	public Employee()
	{
		
	}
	public Employee(String pname, int psalary, String pmail, String paddrs, int ppincode) {
		super();
		this.pname = pname;
		this.psalary = psalary;
		this.pmail = pmail;
		this.paddrs = paddrs;
		this.ppincode = ppincode;
	}
	@Override
	public String toString() {
		return "Employee [pname=" + pname + ", psalary=" + psalary + ", pmail=" + pmail + ", paddrs=" + paddrs
				+ ", ppincode=" + ppincode + "]";
	}
	
	
	
}
