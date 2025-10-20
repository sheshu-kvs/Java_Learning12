package JavaRevsion;

import java.util.Arrays;

public class MergeSortKunal {
    public static void main(String[] args) {
        int ar[]={5,4,3,2,1};
        int []res=mergeSort(ar);
        System.out.println(Arrays.toString(res));

    }
    static int [] mergeSort(int a[]){
        if(a.length==1){
            return a;
        }
        int mid=a.length/2;
        int left[]=mergeSort(Arrays.copyOfRange(a,0,mid));
        int right[]=mergeSort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }

    static int[] merge(int [] left,int right []){
        int res[]=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                res[k++]=left[i++];
            }
            else{
                res[k++]=right[j++];
            }
            // k++;
        }
        while(i<left.length){
            res[k++]=left[i++];
        }
        while(j<right.length){
            res[k++]=right[j++];
        }
        return res;

    }
    
}
