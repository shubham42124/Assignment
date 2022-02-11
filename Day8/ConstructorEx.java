public class ConstructorEx {

   public ConstructorEx() {
	   
	   this("Shubham"); //calling current class param conctor
	   
	   System.out.println("this is deaflut construr");
	   System.out.println(this);
	   
   }	

   public ConstructorEx(int x,String y) {
	   
	   System.out.println(this);//1
	   
   }
  public ConstructorEx(String name) {
	  this(45,"fg");
	  System.out.println("i am param construot called by defalut constructor");
  }

  public static void main(String[] args) {
	
	  ConstructorEx cx= new ConstructorEx();

	  
}

}