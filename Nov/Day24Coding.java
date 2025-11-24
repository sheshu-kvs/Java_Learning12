public class Day24Coding {
    static void fibonacii(){
        int num = 7;
        int first=0;
        int second=1;
        System.out.println();
        for(int i=0;i<num;i++){

            System.out.println(first);
            int temp = first + second;
            first = second;
            second = temp;



        }
    }
    public static void main(String[] args) {
        fibonacii();
    }
    
}
