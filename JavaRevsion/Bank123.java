class Bank{
    private int balance=1000;

    void deposit(int amount){
        balance+=amount;
        System.out.println("User Deposited Amount Succesfully balance in the Account!!"+balance);
    }

    void withdraw(int amount){
        if(amount<balance){
            balance=balance-amount;
            System.out.println("User  withrwan Succesfully!!");
            System.out.println("The Balance in the Account is:"+balance);
        }
        else{
            System.out.println("Not Sufficient balance");
        }
    }
    void checkBalance(){
        System.out.println("The Total Balance in the Account is the:"+balance);
    }
}






public class Bank123{
    public static void main(String[] args){
        Bank b1=new Bank();
        b1.deposit(500);
        b1.withdraw(1000);
        b1.checkBalance();

    }
}