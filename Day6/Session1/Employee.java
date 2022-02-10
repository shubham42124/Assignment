public class Employee{

    public void emp(){
        int id = 101;
        String name = "Christan";
        String desgn = "Manager";
        System.out.println(name + "\nDesignation: " +desgn);
System.out.println(name + "\nID: " +id);
System.out.println(name + "\nName: " +name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.emp();

    }
}