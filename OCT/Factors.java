public class Factors {
   static void  checkFactor(int num){
        for(int i=1;i<=10;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    static void MultiPlicationNumber(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
    static void MultiplcationOfParticularNumber(int num){
        int a[]={10,23,20,40,90};
        for(int i=0;i<a.length;i++){
        //   if(a[i]%num==0){
        if(a[i] % num==0){
            System.out.println("value "+a[i]);
          }
        }
    }
    static boolean checkPrime(int num){
        int count=0;
      for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
      }
      if(count==2){
        // System.out.println("Prime "+num);
        return true;
      }
      else{
        // System.out.println("Not Prime "+num);
        return false;
      }
    }
    public static void main(String[] args) {
        // checkFactor(8);
        // MultiPlicationNumber(10);
        // MultiplcationOfParticularNumber(10);
        int num=1000;
        for(int i=0;i<num;i++){
            if(checkPrime(i)){
                System.out.println("Prime Numbers "+i);
            }
        }
        // checkPrime(7);
    }
}
