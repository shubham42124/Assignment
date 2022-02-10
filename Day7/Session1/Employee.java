 

public class ArrayOfObjects  
{  
public static void main(String args[])  
{  
 
Employee[] obj = new Employee[5] ;  

obj[0] = new Employee(23907,"Shubham");  
obj[1] = new Employee(91240,"Ravi");  
obj[2] = new Employee(29823,"Vishal");  
obj[3] = new Employee(11908,"Manish");  
obj[4] = new Employee(43590,"Akshit");  
System.out.println("Employee Object 1:");  
obj[0].display();  
System.out.println("Employee Object 2:");  
obj[1].display();  
System.out.println("Employee Object 3:");  
obj[2].display();  
System.out.println("Employee Object 4:");  
obj[3].display();  
System.out.println("Employee Object 5:");  
obj[4].display();  
}  
}  

class Employee  
{  
int pro_Id;  
String pro_name;  
  
Employee(int pid, String n)  
{  
pro_Id = pid;  
pro_name = n;  
}  
public void display()  
{  
System.out.print("Employee Id = "+pro_Id + "  " + " Employee Name = "+pro_name);  
System.out.println();  
}  
} 
