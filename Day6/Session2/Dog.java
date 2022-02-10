class Animal{
 void display(){
System.out.println("It is a animal");
}
}
class Dog extends Animal{
void display(){
System.out.println("It is a Dog");

}

public static void main(String args[])
{
 Dog d=new Dog();
d.display();
}
}

