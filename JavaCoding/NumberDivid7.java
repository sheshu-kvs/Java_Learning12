package JavaCoding;

import java.util.Scanner;

public class NumberDivid7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
           int num=scan.nextInt();
        //    num divides the 7
        //    if(num>0){
        //     if(num%7==0){
        //         System.out.println("Yes Num is divide with 7");
        //     }
        //     else{
        //         System.out.println("Num is not divide with the 7");
        //     }
        //    }
        //    else{
        //     System.out.println("Num should  > 0");
        //    }
        for(int i=1;i<11;i++){
            if(num%i==0){
                System.out.println("Multiples of the Num"+i);
            }
        }
    }
}
