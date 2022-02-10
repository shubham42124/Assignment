 
public class simple  {
      public static void main(String args[]){ 
        Beverages obj=new Tea();
       obj.addIngredient();
      }
}
abstract class Beverages{
        public void addMilk(){
        System.out.println("Add Milk");
       } 
   abstract public void addIngredient();
}
class Tea extends Beverages{
              public void addIngredient(){
              System.out.println("Tea Class");
                     }
}
class Coffee extends Beverages{
     public void addIngredient(){
      System.out.println("Coffee Class");
       }
}
