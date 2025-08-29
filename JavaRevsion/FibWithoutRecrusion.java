public class FibWithoutRecrusion {
    public static void main(String[] args) {
        int num=10;
           fibo(num);
        // System.out.println(res);
        // for(int i=0;i<num;i++){
        //     System.out.println(fibo(i));
        // }
    }
    // private static int  fibo(int num){
    //     if(num==0){
    //         return 0;
    //     }
    //     if(num==1){
    //         return 1;
    //     }
    //    return fibo(num-1)+fibo(num-2); 
    // }
    private static void fibo(int num){
        int first=0,second=1;
        for(int i=0;i<num;i++){
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
