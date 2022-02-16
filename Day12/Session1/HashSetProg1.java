import java.util.*;  
public class HashSetProg1{  
public static void main(String args[]){  
 
HashSet set=new HashSet();  
for(int i=0;i<10;i++)
{
    set.add(i+" ");
}
set.add("Ravi");  
set.add("Vijay");  
set.add(20.05f);  
set.add("Ajay");  
  
Iterator itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
