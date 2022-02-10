class Student{
       int Id;
        String name;
  Student()
{
    Id=10;
    name="Shubham";
}
Student(int a,String b){
    Id=a;
    name=b;
}
void display(){
System.out.println("ID="+Id+"Name="+name);
}
public static void main(String args[])
{
   Student S=new Student();
S.display();
   Student S1=new Student(10,"Aman");
S1.display();

}
}