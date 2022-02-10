public class Default {
    static int v1;
    static float v2;
    static char v3;
    int v4;
    float v5;
    char v6;
    boolean v7; 


    public static void main(String[] args) {
        Default v = new Default();
        System.out.println("static int: "+Default.v1);
        System.out.println("static float: "+Default.v2);
        System.out.println("static char: "+Default.v3);
        System.out.println("instance char: "+v.v4);
        System.out.println("instance float: "+v.v5);
        System.out.println("instance char: "+v.v6);
        System.out.println("instance boolean: "+v.v7);
    }
}
