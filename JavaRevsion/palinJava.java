import java.util.Arrays;

public class palinJava {
    public static void main(String[] args) {
        int num=121;
        int original=num;
        int rev=0;
       while(num>0){
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
       }
    //    System.out.println("reverse Number"+rev);
       if(rev==original){
        System.out.println("Palin");
       }
       else{
        System.out.println("Not Palin");
       }
        
    }
    
}
