public class Day7Coding {
    static void ReverseNumber(){
        int num=2345;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev * 10+rem;
            num=num/10;
        }
        System.out.println("Reverse Number "+rev);
    }
    static  void sumOfNumber(){
        int num =2345;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            num = num /10;
        }
        System.out.println("Sum of the Number "+sum);
    }
    static  int  CountNumberofDigit(int num){
        // int num =2345;
        int count = 0;
        while(num>0){
            int rem = num%10;
            count++;
            num = num /10;
        }
        // System.out.println("Number of the Digits "+count);
        return count;
    }

    static void aramstrongNumber(){
        int num =1513;
        int original = num;
        int sum = 0;
        int numberOfDigit = CountNumberofDigit(num);
        while(num>0){
            int rem = num % 10;
            sum += Math.pow(rem,numberOfDigit);
            num  = num/10;
        }
        if(sum == original){
            System.out.println("Armstrong Number "+original);
        }
        else{
            System.out.println("Not An Armstrong Number "+original);
        }
    }
    public static void main(String[] args) {
        // ReverseNumber();
        // sumOfNumber();
        // CountNumberofDigit();
           aramstrongNumber();
    }
}
