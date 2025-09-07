import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int val=scan.nextInt();
        int num=153;
        arm(num);
        for(int i=0;i<val;i++){
            System.out.println(arm(i));
        }
    }
    private static String arm(int num){
        int countdig=countNum(num);
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,countdig);
            num=num/10;
        }
        if(sum==original){
            return "Armstrong Number "+original;
        }
        else{
            return "Number is not armstrong "+original;
        }


    }
    private static int countNum(int num){
        int count=0;
        while(num>0){
            int rem=num%10;
            count++;
            num=num/10;
        }
        return count;
    }
}
