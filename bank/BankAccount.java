package bank;

// import java.util.Scanner;

// class Atm{
//     private static float Balance=1000;
//     // private static int count;

//     public  void deposit(float amount){
//         Balance+=amount;
//         System.out.println("The Total balance in the Bank Account IS:"+Balance);
//     }
//     public  void withdraw(int amount){
//         if(amount<Balance){
//               Balance-=amount;
//               System.out.println("The Balance in the Account IS: "+Balance);
//         }
//         else{
//             System.out.println("Hey User there is not sufficient Balance!!");
//         }
      
//     }
//     public   void checkBal(){
//         System.out.println("The Balanace in the Account is the: "+Balance);
//     }

// }
// class InvalidUserException extends Exception
// {
//     @Override
//     public String getMessage(){
//         return"Please Contact the Nearest Bank";
//     }

//     // void input(){
//     //     Scanner scan=new Scanner(System.in);
//     //     System.out.println("Enter the UserName:");
//     //     String name=scan.next();
//     //     System.out.println("Enter the Password:");
//     //     String pwd=scan.next();
//     // }

//     // void disp(){

//     // }
// }
// public class bank123 {
//       private static Atm a1=new Atm();
//       private static Scanner scan=new Scanner(System.in);
//       private static String uName="bank";
//       private static String pwd="1234";
//     //   private  static int count=0; 
//     public static void main(String[] args) {
      
//         // a1.deposit(500);
//         // a1.withdraw(2000);
//         // a1.checkBal();
// System.out.println(" ");
//         System.out.println("Hi User Welcome to the ATM");
//         System.out.println("Enter the UserName: ");
//         String name=scan.next();
//         System.out.println("Enter the Password: ");
//         String passWord=scan.next();
//         if((name.equalsIgnoreCase(uName)) &&(passWord.equalsIgnoreCase(pwd))){
//             System.out.println("Login Successfully!! User ");
//              boolean running=true;
//         while(running){
//             System.out.println("Hi welcome to the Atm");
//             System.out.println("1 Deposit");
//             System.out.println("2 Withdraw");
//             System.out.println("3 Check Balance");
//             // System.out.println("4 Track total deposits");
//             // System.out.println("5 Track total withdrawals");

//             char  expr=scan.next().charAt(0);
           
//             switch(expr){
//                 case'1':
                               
//                 System.out.println("Enter the amount want to deposit");
//                 float amount=scan.nextFloat();
//                 a1.deposit(amount);
//                 int val=trackTotalDep(expr);
//                 break;

//                 case'2':
//                 System.out.println("Enter the Amount to withdraw");
//                 int am=scan.nextInt();
//                 a1.withdraw(am);
//                 break;

//                 case'3':
//                 a1.checkBal();
//                 break;
//                 case'4':
//                 int count=0;
//                 // trackTotalDep(count);


//                 // System.out.println(count);

//                 break;


//                 default:
//                 System.out.println("Invalid Option Please click the Valid One..");
//             }
//         }
//         }
//         else{
//             System.out.println("Hey User Entered Wrong Credentials:");
//         }
//     }
//     public static int trackTotalDep(int count){
//         return count++;
//     }
// }
public class BankAccount{
    protected  String AccountHolderName;
    protected  String AccountNumber;
    protected  float Balance;

    public BankAccount(String AccountHolderName,String AccountNumber,float Balance){
        this.AccountHolderName=AccountHolderName;
        this.AccountNumber=AccountNumber;
        this.Balance=Balance;
    }

    public  void deposit(float amount){
        Balance+=amount;
        System.out.println("The Total balance in the Bank Account IS:"+Balance);
    }
    public  void withdraw(int amount){
        if(amount<Balance){
              Balance-=amount;
              System.out.println("The Balance in the Account IS: "+Balance);
        }
        else{
            System.out.println("Hey User there is not sufficient Balance!!");
        }
      
    }
    public  void checkBal(){
        System.out.println("The Balanace in the Account is the: "+Balance);
    }

 

    public void DispAccountInfo(){
        System.out.println(AccountHolderName);
        System.out.println(AccountNumber);
        System.out.println(Balance);
    }
}