import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // int a1[]={2,7,11,15};
        // int a1[]={3,2,4};
        int a1[]={3,3};
        int tar=6;
        printIndeices(a1,tar);
    }

    private static void printIndeices(int[] a1,int target) {
        ArrayList<Integer>arr =new ArrayList<>();
        for(int i=0;i<a1.length;i++){
        for(int j=i+1;j<a1.length;j++){
          if(a1[i]+a1[j]==target){
            arr.add(i);
            arr.add(i+1);

          }
        }
        }

        int newArr[]=new int[arr.size()];
        int m=0;
        for(int k=0;k<newArr.length;k++){
            newArr[m]=arr.get(k);
        }

        System.out.println(Arrays.toString(newArr));
    }
}
    
