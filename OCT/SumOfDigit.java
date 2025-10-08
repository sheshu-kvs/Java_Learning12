import java.util.HashSet;

public class SumOfDigit {
    static void sumOfThreeDigits(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of the Digits "+sum);
    }
    static void powerOfNumber(int num){
       System.out.println(Math.pow(num, 2));
    }
    static void powerOfNumberWithoutUsingtheMath(int num,int expo){
         int res=1;

        //  for(int i=0;i<expo;i++){
        //     res=res*num;
        //  }
        //  System.out.println("Power Of The Number "+res);

        //  using the While loop
        int i=0;
        while(i<expo){
            res *= num;
            i++;
        }
       System.out.println("Power Of The Number "+res);
    }

    static void reverseNumber(int num){
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev = rev * 10 +rem;
            num=num/10;
        }
        System.out.println("Reverse An Number "+rev);
    }

    static void removeDuplicates(int[] a){
       HashSet<Integer> h1=new HashSet<>();
       for(int a2:a){
        h1.add(a2);
       }
       System.out.println(h1);
    }
    public static void main(String[] args) {
        // sumOfThreeDigits(123);
        // powerOfNumber(8);
        // powerOfNumberWithoutUsingtheMath(8,2);
        // reverseNumber(1234);
        int a[]={1,2,1,1};
        removeDuplicates(a);

    }
}
