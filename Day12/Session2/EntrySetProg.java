import java.util.*;
  
public class Hash_Map_Demo {
    public static void main(String[] args)
    {
  
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
     
        hash_map.put(10, "shubham");
        hash_map.put(15, "4");
        hash_map.put(20, "ravi");
        hash_map.put(25, "akshit");
        hash_map.put(30, "rupanshu");
  
   
        System.out.println("Initial Mappings are: " + hash_map);
  
     
        System.out.println("The set is: " + hash_map.entrySet());
    }
}
