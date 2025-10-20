// An Exception that occurs during the execution of the JAVA Programs is called as the Exceptions..













public class Exceptions1 {
   void disp(){
     try{
       int a=100;
       int b=0;
        System.out.println("Division Result "+(a/b));
         String s=null;
       System.out.println(s.charAt(0));
       }
    catch(ArithmeticException e){
        System.out.println("Please Enter the Non Zero Number");
    }
    catch(NullPointerException nw){
        System.out.println(nw.printStackTrace());
    }

   }
  
    
    public static void main(String[] args) {
        Exceptions1 e1=new Exceptions1();
           e1.disp();
           
//    int a[]=new int[2];
//     // a[0]=10;
//     // a[1]=10;
//     // a[2]=10;
//  for(int i=0;i<a.length;i++){
//     System.out.println(a[i]);
// }
      
    }
    }
    
