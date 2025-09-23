package JavaCoding2;




class school{
    private int marks = 100;

    // public void disp( ){
    //     System.out.println("the marks to be the greater than zero");
    // }
    public void assigmarks(int m1){
        if(m1<=marks && m1>=0){
            System.out.println("The marks obtained out of the 100 "+m1);
        }
        else{
            System.out.println("The marks are the invalid");
        }
    }
    public int getMarks(){
        return marks;
    }
}

class bank{
    private int balance=1000;
    public void deposit(int am){
        balance+=am;
        System.out.println("The Balance in the Bank Account "+balance);
    }

    public void balanace(){
        System.out.println("The Balance in the Account is the "+balance);
    }
}
public class OopsEncapsulation {
    // Each and every object was very important part that is data to 
    // provide data to the security  we are  using the private keyword controlled 
    // access through the setters and getters.
    // consider we have bank no one can access the bank balance directly to achive that we are using the 
    // one of the oops concept we are using that is the encapsulation
    // in the above example we have taken the  marks has the private no one

    
    public static void main(String[] args) {
        // bank b1=new bank();
        // b1.deposit(100);  

        school s1=new school();
        // s1.assigmarks(120);
        // s1.assigmarks(-1);
        int res=s1.getMarks();
        System.out.println("Marks "+res);
    }
}
