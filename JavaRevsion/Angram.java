package JavaRevsion;

import java.util.Arrays;

public class Angram {
    public static void main(String[] args) {
        // String s1="cat";
        // String s2="actq";


        // char ch1[]=s1.toCharArray();
        // char ch2[]=s2.toCharArray();


        // Arrays.sort(ch1);
        // Arrays.sort(ch2);

        // if(Arrays.equals(ch1,ch2)){
        //     System.out.println("Angram String");
        // }
        // else{
        //     System.out.println("Not Angram");
        // }




        int num=153;

        // countNum(num);
        Angarm(num);

        
    }

    private static int countNum(int num) {
        int count=0;
        while(num>0){
            int re=num%10;
            count++;
            num=num/10;
        }
        return count;
    }
    private static void Angarm(int num){
        int original=num;
        int sum=0;
        int digits=countNum(num);
       while(num>0){
         int lastdi=num%10;
        sum+=Math.pow(lastdi,digits);
        num=num/10;
       }
         if(sum==original){
        System.out.println("Angarma");
         }
        else{
         System.out.println("Not Angarma");
          } 
    }
   
    
}
