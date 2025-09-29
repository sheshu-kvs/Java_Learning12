package JavaCoding;

public class UntillSingleDigitSum {
    static void SumUntillSingle(int num){
       int sum=0; 
       while(num>=10){
        sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        num=sum;
       }
        System.out.println("Sum of the Digit Untill the Single "+sum);
    }
    public static void main(String[] args) {
        int num=99;
        SumUntillSingle(num);
    }
}
