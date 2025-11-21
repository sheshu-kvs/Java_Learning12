import java.util.ArrayList;
import java.util.Arrays;

public class Day21coding{
    static  void MoveZerostoFront(){
        int a[]={1,2,3,-1,5,-1};
        int nonone = a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=-1){
                a[nonone--] = a[i];
            }
        }
        while(nonone >= 0){
            a[nonone--] = -1;
        }

        System.out.println(Arrays.toString(a));
    }

    static void  MoveZerosEnd(){
        int a [] ={0,0,3,0,5};
        int nonZer=0;
        for(int i=0;i<a.length;i++){
            if(a[i] !=0){
                a[nonZer++] = a[i];
            }
        }

        while(nonZer<a.length){
            a[nonZer++]=0;
        }
        System.out.println(Arrays.toString(a));
     }
     static void bublleSort(){
        /*Input: [3, -1, -7, 2, 5]
          Output: [-1, -7, 3, 2, 5] */
        int a [] ={3,-1,-7,2,5};
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-i-1;j++){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1]=temp;

            }
        }
        }
        System.out.println(Arrays.toString(a)); 
     }


     static void MoveAllEvenToFrontAndOddToBack(){
        // Input: [1, 2, 3, 4, 6]
        // Output: [2, 4, 6, 1, 3]
        int a [] = {1, 2, 3, 4, 6};
        ArrayList a12 = new ArrayList();
        int even = a.length-1;
        for(int i=a.length-1;i>=0;i--){
           if(a[i]%2!=0){
            a[even--] =a[i]; 
            a12.add(a[i]);
           }
        }
        while(even>=0){
            // a[even--] =1;
            // for(int i=0;i<a12.size();i++){
            //     a[even--]  = (Integer)a12.get(i);
            // }

        }
        System.out.println(Arrays.toString(a));
     }
    public static void main(String[] args) {
        // MoveZerostoFront();
        // MoveZerosEnd();
        // bublleSort();
        MoveAllEvenToFrontAndOddToBack();
    }
}
