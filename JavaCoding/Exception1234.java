package JavaCoding;

import java.util.Scanner;

class InvalidUserException extends Exception{

    public String getMessage(){
        return "Invalid Credential Please Try Again Once!!";
    }
}
class Atm{
    int accNum=5533;
    int passWord=1234;
    int originalAc;
    int Pass;
    void acceptInput(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Account Number:");    
    originalAc=scan.nextInt();
    System.out.println("Enter the Password");
    Pass=scan.nextInt();
    }
       void disp() throws InvalidUserException{
        if((accNum==originalAc) && (passWord==Pass)){
          System.out.println("Please Collect the Money");
        }
        else{
            InvalidUserException iue=new InvalidUserException();
            System.out.println(iue.getMessage());
            throw iue;
           
        }
    }
}


class Bank{
    Atm b=new Atm();

  void init(){
    try{
      b.acceptInput();
      b.disp();
    }
    catch(Exception ie1){
        try{
            b.acceptInput();
            b.disp();
        }
        catch(Exception ie2){
            try{
                b.acceptInput();
                b.disp();
            }
            catch(Exception ie3){
                 try{
                      b.acceptInput();
                      b.disp();
                 }
                 catch(Exception ie4){
                    System.out.println("Card Blocked Please Visit The Bank");
                 }
            }
        }
    }
  }
}
public class Exception1234 {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.init();
    }
}

