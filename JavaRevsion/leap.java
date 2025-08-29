package JavaRevsion;

public class leap {
    public static void main(String[] args) {
        int num=2021;
        if((num%4==0 && num%100!=0) || num%400==0){
            System.out.println("");
            System.out.println("Leap");
        }
        else{
            System.out.println("Not Leap..");
        }
    }
    
}
