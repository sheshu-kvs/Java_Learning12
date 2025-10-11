package JavaRevsion;

import java.util.Arrays;

public class FindAvgNumbers {
    static void PowerOfNumberWithoutBuiltIn(int num){
        int val=num*num*num;
        System.out.println(val);                           
    }
    static void PrintAscii(int num){
        char val=(char)num;
        System.out.println(val);
    }
    static void printIloveJava(int num){
        for(int i=0;i<num;i++){
            System.out.println("I Love Java");
        }
        int i=0;
        while(i<num){
            System.out.println("I Love Java");
            i++;
        }

    }
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=60;
        int avg=(num1+num2+num3)/3;
        int a1[]=new int[1];
        int i=0;
        while(i<a1.length){
            a1[i++]=avg;
        }
        System.out.println("Average"+avg);
        System.out.println(Arrays.toString(a1));
        int val=3;
        PowerOfNumberWithoutBuiltIn(3);

        PrintAscii(65);
        printIloveJava(5);
    }
    
}
