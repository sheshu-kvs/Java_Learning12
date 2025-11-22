import java.lang.reflect.Array;
import java.util.Arrays;

public class Day22Coding {
    static void LargestWord(){
        String str="hello,morin,ferinmark";
        int max=0;
        String t="";
        String[] strWords=str.split(",");
        for(String word:strWords){
         if(word.length()>max){
            max=word.length();
             t=word;
         }
        }
        System.out.println("Max-Word");
        System.out.println(t);
    
    }


    static int[]  mergeSort(int [] a){
        // int a[]={5,3,8,1};
        if(a.length<=1){
            return a;
        }
        int mid = a.length/2;
        
        int [] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        left = mergeSort(left);    
        right =mergeSort(right);
    
        
        return mergeTwoArrays(left,right);
    }
    static  int [] mergeTwoArrays(int a1[],int a2[]){
        int res [] = new int[a1.length+a2.length];
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                res[k++] = a1[i++];
            }
            else{
                res[k++] = a2[j++];
            }
        }

        while(i<a1.length){
            res[k++] = a1[i++];
        }
        while(j<a2.length){
            res[k++] = a2[j++];
        }
        return  res;
    }
    public static void main(String[] args) {
        //  LargestWord();
        int a[]={5,3,8,1};

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(mergeSort(a)));


      }
}
