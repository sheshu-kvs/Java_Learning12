package JavaCoding;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNonZero{
    public static void main(String[] args) {
        int a[]={2,3,0,1,0,2,0,4};
        int nonzero=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                a[nonzero--]=a[i];
            }
        }
        while(nonzero>=0){
            a[nonzero--]=0;
        }

        System.out.println(Arrays.toString(a));
    }
    
}