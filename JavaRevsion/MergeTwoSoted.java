import java.util.Arrays;
import java.util.HashSet;

public class MergeTwoSoted {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int a2[]={6,9,5,8,9};

        int res[]=new int[a1.length+a2.length];

        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                res[k++]=a1[i++];
            }
            else{
                res[k++]=a2[j++];
            }
        }

        while(i<a1.length){
            res[k++]=a1[i++];
        }


        while(j<a2.length){
              res[k++]=a2[j++];
        }


        System.out.println(Arrays.toString(res));
       

        // HashSet<Integer> map=new HashSet<>();
        // for(int a123:res){
        //     map.add(a123);
        // }
        // System.out.println(" Merge Sorted Array "+map);
        System.out.println();
    }


    private static void  bubble(int a1[]){
    int n=a1.length-1;
    for(int i=0;i<a1.length;i++){
    for(int j=0;j<n-i-1;j++){
        if(a1[j]>a1[j+1]){
            int temp=a1[j];
            a1[j]=a1[j+1];
            a1[j+1]=temp;
        }
    }
  }
  System.out.println(Arrays.toString(a1));

    }
}
