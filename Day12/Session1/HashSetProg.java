import java.util.*;  
public class HashSetProg{  
public static void main(String args[]){  
 
HashSet set=new HashSet();  
for(int i=0;i<10;i++)
{
    set.add(i);
}
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
 
System.out.println(set);  
  
}  
}  
