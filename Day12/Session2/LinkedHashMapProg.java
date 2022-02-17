import java.util.*;
  
public class LinkedHashMapProg {
    public static void main(String[] args)
    {
  
     
       LinkedHashMap<Integer, String> hash_map = new LinkedHashMap<Integer, String>();
  
        // Mapping string values to int keys
        hash_map.put(10, "rutvi");
        hash_map.put(15, "akshit");
        hash_map.put(20, "rupanshu");
        hash_map.put(25, "pranav");
        hash_map.put(30, "varun");
  
       
        System.out.println("Initial Mappings are: " + hash_map);
  
       
    }
}
