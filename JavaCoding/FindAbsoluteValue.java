package JavaCoding;

import java.util.Scanner;

public class FindAbsoluteValue {
     protected Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num > 0 && num <9){
            System.out.println("Entered Single Digit");
        }
        else if(num>=10 && num<=99){
            System.out.println("Entered two digits");
        }
        else if(num > 100 && num < 999){
            System.out.println("Entered Three digits");
        }
    }
    
}
