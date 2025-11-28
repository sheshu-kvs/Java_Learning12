
import java.util.ArrayList;

public class Day28Coding {
    static boolean ReverseNumber(String num){
        // int num=121;
        int val = Integer.valueOf(num);
        int original = val;
        int rev = 0;
        while(val>0){
            int rem = val%10;
            rev = rev*10+rem;
            val=val/10;
        }
        // System.out.println("Reverse Number "+rev);
        if(original == rev){
            // System.out.println("Entered Number is the Palindrome...");
            return true;
        }
        else{
            // System.out.println("Entered Number is not Palindrome..");
            return false;
        }
    }

    static void printAllSubArrays(){
        int a[]={1,2,1,7,5,4,5,8,9,8};
        for(int size=1;size<a.length;size++){
            for(int i=0;i<=a.length-size;i++){
                 String val="";
                for(int j=i;j<i+size;j++){
                    val=val+a[j];
                }
                if(ReverseNumber(val)){
                    System.out.println(val);
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        // ReverseNumber();
        printAllSubArrays();
    }
}
