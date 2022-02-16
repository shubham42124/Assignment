import java.util.*;  
class Test{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
  
      //displaying elements
     for(int i=0;i<alist.size();i++)
     {
         System.out.println(alist.get(i)+" ");
     }
      System.out.println("For Each LOOP********************************");
  for(String str:alist){
      System.out.println(str);
  }
  
      
   }  
}
