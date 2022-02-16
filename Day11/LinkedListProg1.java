import java.util.*;
public class LinkedListProg1{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Steve");
     list.add("Carl");
     list.add("Raj");

     //Adding an element to the first position
     list.addFirst("Negan");

     //Adding an element to the last position
     list.addLast("Rick");

     //Adding an element to the 3rd position
     list.add(2, "Glenn");

System.out.println("Calculate the size of linked list: "+list.size());
System.out.println("Check element is present or not: "+list.contains("ravi"));
System.out.println("Linked lis is empty or not: "+list.isEmpty());
System.out.println("Linked list first element: "+list.getFirst());

     //Iterating LinkedList
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
   } 
} 
