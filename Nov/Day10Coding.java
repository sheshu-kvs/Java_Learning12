import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Day10Coding {
    static void DisplaySubstringJava(){
        String str="java";
       
        Set<String> set=new LinkedHashSet<>();
        for(int size=1;size<=str.length();size++){
            for(int i=0;i<=str.length()-size;i++){
              String substr = str.substring(i,i+size);
                set.add(substr);
            }
        }
        for(String values:set){
            System.out.println(values);
        }
    }
    static void printtheminmaxOfArray(){
        int a[]={5,8,2,9,3};
        int max =Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    static void rearrangeArrayPositiveToNegative(){
        int a[]={-1,2,-1,4,-1};
        int nonzer=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1){
                a[nonzer++]=a[i];
            }
        }
        System.out.println();
        while(nonzer<a.length){
            a[nonzer++]=-1;
        }
        System.out.println(Arrays.toString(a));
    }
     static void rearrangeArrayNegativeToPositive(){
        int a[]={-1,2,-1,4,-1};
        int nonzer=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=-1){
                a[nonzer--]=a[i];
            }
        }
        System.out.println();
        while(nonzer>0){
            a[nonzer--]=-1;
        }
        System.out.println(Arrays.toString(a));
    }
    static void MovePositiveFront(){
        int a[] = {-1, 2, 3, -4, 5};
        int a2[]=new int[a.length]; 
        ArrayList<Integer> positive =new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                positive.add(a[i]);
            }
            else{
                negative.add(a[i]);
            }
        }
        int index= 0;
        for(int values:positive){
            a2[index++]=values;
        }
        for(int values:negative){
            a2[index++]=values;
        }
       

        System.out.println(Arrays.toString(a2));

    }
    static void SortMatrix(){
        int[][] matrix = {
        {9, 2, 5},
        {7, 1, 3}
    };
    int rows = matrix.length;
    int columns = matrix[0].length;
    int index=0;
    int temp[]=new int[rows*columns];
    for(int i=0;i<rows;i++){
        for(int j=0;j<matrix[i].length;j++){
           temp[index++]=matrix[i][j];
        }
    }
    Arrays.sort(temp);

   index=0;
    for(int i=0;i<rows;i++){
        for(int j=0;j<matrix[i].length;j++){
            matrix[i][j]=temp[index++];
            System.out.println(matrix[i][j]);
        }
    }
    // System.out.println(Arrays.deepToString(matrix));
    }

    static void printVowels(){
        // 1 Takes a string

        // Splits it into words

        // For every word:

        // Go through each character

        // If it’s a vowel

        // Look left until you find a consonant

        // Replace the vowel with that consonant

        // Join all processed words

        // Print the final output
        String str="java";

    }
    public static void main(String[] args) {
    //   DisplaySubstringJava();
    //   printtheminmaxOfArray();
    //   rearrangeArrayNegativeToPositive();
    // MovePositiveFront();
    SortMatrix();

    }
    
}
