
public class Day6Coding {
    static void TwoFractionalPart(){
        float a = 12.56f;
        int b=10;
        System.out.printf("%.20f ",a/b);
    }
    static void CheckNumberDivisible5and11(){
        int num = 20 ;
        if(num % 5 == 0 && num % 10 ==0 ){
            System.out.println("Entered Number is Divisible by 5 and 10 "+num);
        }
    }

    static void  multiplyoftwoNumber(){
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("Multiply of two "+a[i]);
            }
        }
    }
    static void divisibiltyof10(){
        int num=51;
        if(num%10==0){
            System.out.println("Enter the number is divisible of 10 "+num);
        }
    }
    static void FactorsOfnum(){
        int num=10;
        for(int i=1;i<=10;i++){
            if(num%i==0){
                System.out.println("Factors of number "+i);
            }
        }
    }
    static boolean Checkprime(int num){
        int count=0;
        if(num<=1){
            return  false;
        }
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count==2){
            // System.out.println("Enter Num is the Prime.. ");
            return true;
        }
        else{
            // System.out.println("Entered Num is not the Prime Number..");
            return false;
        }

    }
    static void PrintPrimeNumbers(){
        int num = 100;
        int count =0;
        for(int i=1;count<num;i++){
           if(Checkprime(i)){
             System.out.println(i);
             count++;
           }
        }
    }
    
    public static void main(String[] args) {
        // TwoFractionalPart();
        // CheckNumberDivisible5and11();
        // multiplyoftwoNumber();
        // divisibiltyof10();
        // FactorsOfnum();
        // Checkprime();
         PrintPrimeNumbers();
    }  
}
