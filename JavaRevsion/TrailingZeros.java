package JavaRevsion;

    public class TrailingZeros{
    static int trailing(int num){
       int res=0;
       int powerof5=5;
       while(num>=powerof5){
        res=res+(num/powerof5);
        powerof5=powerof5*5;
       }
       return res;
    }
    public static void main(String[] args){
        int num=25;
        int res=trailing(num);
        System.out.println(" res "+res);

    }
}
    
