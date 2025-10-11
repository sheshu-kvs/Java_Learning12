package JavaCoding;

public class Swap12{
    static void swap(){
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        b=a-b;
        System.out.println("a value "+a);
        System.out.println("b value "+b);
    }
    public static void main(String[] args) {
        swap();
    }
}
