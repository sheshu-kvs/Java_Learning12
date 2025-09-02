import java.util.HashSet;
import java.util.Set;

public class Happy {
    public static void main(String[] args) {
        int num=19;
        if(happuNum(num)){
            System.out.println("Entered Number is the Happy "+num);
        }
        else{
            System.out.println("Entered Number is not Happy "+num);
        }
        // System.out.println("Result "+res);
    }
  
    private static int  getSumOfSquares(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+(rem*rem);
            num=num/10;
        }
        return sum;
    }
     private static boolean happuNum(int n) {
        // Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            // seen.add(n);
            n = getSumOfSquares(n);
        }
        return n == 1;
    }
}


//  && !seen.contains(n)