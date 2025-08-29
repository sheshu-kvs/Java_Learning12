package JavaRevsion;

public class fact {
    public static void main(String[] args) {
        int num=4;
        int fact=1;
        // for(int i=num;i>=1;i--){
        //     fact*=i;
        // }
        while(num>1){
            fact*=num;
            num--;
        }
        System.out.println("");
        System.out.println(fact);
    }
    
}
