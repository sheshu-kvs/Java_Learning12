public class MultiRecursion {
    public static void main(String[] args) {
        int num=4;
       
        multi(num,1);
    }
    private static void multi(int num,int i){
        
        if(i>10){
         return;
        }
        System.out.println(num+ " X " +i+ " = " +num*i);
         multi(num, i+1);
    }
    
}
