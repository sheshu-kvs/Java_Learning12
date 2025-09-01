public class Wrapper {
    static int a=13;
    public static void main(String[] args) {
        Wrapper w1=new Wrapper();
        // Integer a1=new Integer('a');
        Integer a1=Integer.valueOf(a);
        System.out.println("A value::"+a1);

        // System.out.println(w1.a);
    }
}
