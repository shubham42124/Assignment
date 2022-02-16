import java.util.*;  
public class LinkedHashSetProg{  
public static void main(String args[]){  

LinkedHashSet set=new LinkedHashSet();  
for(int i=0;i<10;i++)
{
    set.add(i);
}
set.add("Ravi");  
set.add("Vijay");  
set.add(20.0f);  
set.add("Ajay");  
 
System.out.println(set);  

}  
}  
