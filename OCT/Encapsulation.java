/*Encapsulation Each And Every Object was very important part that is the data to provide the data to the 
 * security controlled access through the setters and the getters
 * consider an example 
 * create one class atm 
 * in kept the balance variable as the private then ,
 * in that no one can access the balance directly??
 * to access that the controlled access through the setters and the getters
 */

class Atm{
    private int balance=1000;


     void deposit(int am){
        balance+=am;
        System.out.println("Deposited Succesfully "+balance);
    }

    void withdraw(int am){
        if(am<balance){
            balance-=am;
            System.out.println("Amount Withdrawn Successfully "+balance);
        }
        else{
            System.out.println("Not Sufficient Balance ");
        }
    }

    void totalbalance(){
        System.out.println("The Balance in the Account is the "+balance);
    }
}




public class Encapsulation {
    
    public static void main(String[] args) {

        Atm a1=new Atm();
        a1.deposit(2000);
        a1.withdraw(3500);
        a1.totalbalance();

    } 
}
