import java.util.Arrays;   
public class ArrayEx  
{   
public static void main(String[] args)   
{   
  
int [] array = {2,90,23,12,45,23};  
  
Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  

for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
} 