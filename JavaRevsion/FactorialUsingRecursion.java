

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num=5;
        int res=fact(num);
        System.out.println(res);
    }
    private static int  fact(int num){
        if(num==0){
            return 1;
        }
         return fact(num-1)*num;
    }  
}
