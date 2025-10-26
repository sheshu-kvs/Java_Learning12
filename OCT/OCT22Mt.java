
import java.util.Scanner;

/*


------Achiving the mt using the Implements Runnable..
class printNumbers  extends  demo implements Runnable {
  
     void disp(){
        System.out.println("This is printnumbers disp");
    }
    public void run(){
        System.out.println("Printing the Numbers been started ");
        for(int i=0;i<10;i++){
            try{
                System.out.println(i);
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
      
    }
}
class printAlpha implements Runnable{
    public void run(){
        System.out.println("Printing the Alphabets been started ");
        for(int i = 65;i < 80;i++){
            try{
                System.out.println((char)i);
                 Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Printing the Alphaabets been Endend ");
    }

}
class AddTwoDigits implements Runnable {
    public void run(){
        System.out.println("Addition of the Two Numbers ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Num1 ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Num2 ");
        int num2 = scan.nextInt();
        System.out.println("The Addition of Two Numbers "+(num1+num2));
        System.out.println("Addition of Numbers been Ended!!");
    }
}




   printNumbers p1 = new printNumbers();
     AddTwoDigits a1 = new AddTwoDigits();
     printAlpha apha =new printAlpha();

     Thread t1 = new Thread(p1);
     Thread t2 = new Thread(a1);
     Thread t3 = new Thread(apha);

      t1.start();
      t2.start();
      t3.start();
 */

 class vehicle{
     public String name;
     public vehicle(String name){
        this.name = name;
     }
 }


 class car extends vehicle implements Runnable{
    private int speed;
    public car(String name , int speed  ){
         super(name);
         this.speed = speed;
    }
    public void run(){
        System.out.println("The Name of the Car "+ name + " and The Speed of the Car " +speed);
    }
 }

public class OCT22Mt {
    public static void main(String[] args) {
        car c1 = new car("audi", 135);
        car c2 = new car("BMW", 135);
        car c3 = new car("Scorpio", 135);


        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        
        t1.start();
        t2.start();
        t3.start();
       
  
    }  
}
