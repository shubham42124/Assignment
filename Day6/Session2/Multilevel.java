public class Multilevel extends Student {
    public static void main(String[] args) {
        
        Multilevel m = new Multilevel();
        m.display();
        m.display1();
    }
}
class Teacher{
    void display(){
        System.out.println("i am a teacher");
    }
}

class Student extends Teacher {
    void display1(){
        System.out.println("i am a student");
    }
}


