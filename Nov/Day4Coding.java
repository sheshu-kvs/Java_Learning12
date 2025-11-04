package Nov;


public class Day4Coding{
    static  void ReverseString(){
        String str="Hello Java";
        int i=str.length()-1;
        String t="";
        while(i>=0){
            // System.out.println(str.charAt(i));
             t=t+str.charAt(i);
            i--;
        }
        System.out.println("Reversed String "+t);
    }
    public static void main(String[] args) {
        ReverseString();
    }
}