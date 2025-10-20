class student{
    // public int id=101;
    // public String name="Alex";
    public int id;
    public String name;
        void disp(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
    }
}
public class Student12 {
    public static void main(String[] args) {
        student s1=new student();
        s1.id=101;
        s1.name="Weien";
        s1.disp();
    }
}