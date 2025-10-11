package JavaCoding;

import java.util.Scanner;

class bankAcc {
    private int balanace = 9999;

    void deposit(int am) {

        if (am > 0) {
            balanace += am;
            System.out.println(balanace);
        } else {
            System.out.println("Invalid Number!!");
        }
    }

    void withdraw(int pin, int am) {
        if (pin == 1234) {
            if (am <= balanace) {
                balanace -= am;
                System.out.println("Amount Successfull withdrawn");
            } else {
                System.out.println("Not Sufficient Balance");
            }
        } else {
            System.out.println("Please Enter the Correct Password");
        }
    }

    public void disp() {
        System.out.println(balanace);
    }

}
class Atm1 extends bankAcc{

}

public class OOpsPrac {
    public static void main(String[] args) {
        bankAcc u1 = new bankAcc();
        // u1.deposit(1000);
        // u1.withdraw(124, 10000);

        u1.disp();

        // Atm1 a1=new Atm1();

        Scanner scan=new Scanner(System.in);
        int am=scan.nextInt();
        u1.deposit(am);
 
       

    }

}
