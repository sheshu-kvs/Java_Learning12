package JavaRevsion;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapTwoNumbers {
    static void StroingNewArray(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(num1);
        a1.add(num2);

        System.out.println(a1);

    }
    public static void main(String[] args) {
        int num1=20;
        int num2=40;

        // StroingNewArray(num1, num2);
        int a1[]=new int[2];
        int i=0;
        // while(i<a1.length){
        //     a1[i++]=num1;
        //     a1[i++]=num2;

        // }
        do{
            a1[i++]=num1;
            a1[i++]=num2;
        }
        while(i<a1.length);
        System.out.println(Arrays.toString(a1));
        // int temp=num1;
        // num1=num2;
        // num2=temp;


        // System.out.println("NUM1 "+num1);
        // System.out.println("NUM2 "+num2);
    }
    
    
}
