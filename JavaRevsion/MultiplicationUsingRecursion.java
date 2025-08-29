public class MultiplicationUsingRecursion {
    public static void main(String[] args) {
        int num=4;
        mul(num,1);
        
    }


    private static void mul(int num ,int i){
        if(i>10){
            return ;
        }
        System.out.println(num+" X "+i+" = "+num*i);

          mul(num,i+1);
    }
}
