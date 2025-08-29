package JavaRevsion;

public class Palindrome {
    public static void main(String[] args) {
        int num=10; 
        int count=0;
    //   checkPrime(num);
      num(num);
    }
    private static boolean checkPrime(int num){
        if(num<2){
            return false;
        }
        int count=0;
          for(int i=1;i<=num;i++){
            if(num%i==0){
                // return false;
                count++;
            }
        }
        // return true;
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }


    private static void num(int num){
        int count=0;
        for(int i=2;count<=num;i++){
            if(checkPrime(i)){
                System.out.println(i);
                count++;
            }
        }
    }
    
}
