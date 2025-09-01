public class FactWithRecursion {
    public static void main(String[] args) {
        int num=5;
        int res=printFact(num);
        System.out.println("Factorial Number "+res);
    }
    private static int printFact(int num){
        if(num==0){
            return 1;
        }
        return printFact(num-1) * num;
    }
    
}
