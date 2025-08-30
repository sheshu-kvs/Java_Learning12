class student{
    private static int id=101;
    private  static String name="Alex";
    protected static void disp(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
    }
}
public class Student12 {
    private void disp(){
        System.out.println(1012);
        System.out.println("Alexwe");
    }
    public static void main(String[] args) {
        Student12 s12=new Student12();
        s12.disp();
        student s1=new student();
        s1.disp();
    }
}