package JavaCoding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lcm {
    public static void main(String[] args) {
        int num=18;
        int num2=24;
        int min=Integer.MAX_VALUE;
      
        int val1[]=new int[10];
        int j=0;
        int val2[]=new int[10];
        int k=0;
        for(int i=1;i<11;i++){
           val1[j++]=num*i;
           val2[k++]=num2*i;
        }
        System.out.println();
        System.out.println(Arrays.toString(val1));
        System.out.println(Arrays.toString(val2));
       for(int m=0;m<val1.length;m++){
        for(int n=0;n<val2.length;n++){
            if(val1[m]==val2[n]){
                if(val1[m]<min){
                    min=val1[m];
                }
            }
        }
       }
       System.out.println("LCM: "+min);
      
      
    }
    
}
