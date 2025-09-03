import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // int userval=scan.nextInt();

        int num=145;
        // printStrong(num);
        // for(int i=0;i<userval;i++){
            printStrong(num);
        // }
    }

    private static void printStrong(int num) {
        int sum=0;
        int original=num;
        while(num>0){
            int lastdigit=num%10;
            int numFact=fact(lastdigit);
            sum=sum+numFact;
            num=num/10;
        }
        // System.out.println("Sum of the Strong "+sum);
        if(sum==original){
            System.out.println("Entered Number is the Strong Number.."+original);
        }
        else{
            System.out.println("Enterd Number is not the Strong Number.." +original);
        }
    }

    private static int fact(int num){
        int fact=1;
         for(int i=num;i>1;i--){
            fact=fact*i;
        }
        return fact;

    }
    
}
