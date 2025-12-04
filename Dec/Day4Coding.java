import java.util.Arrays;

public class Day4Coding {
    public static void main(String[] args) {
        int a[]={1,2,7,3,9,12,10};
        Arrays.sort(a);
        System.out.println("Sorted Array "+Arrays.toString(a));
        int prev=a[0];
        System.out.print(prev+" ");
        for(int i=1;i<a.length;i++){
         if(a[i]-prev==1){
            System.out.print(a[i]+" ");
         }
         else{
            System.out.println();
            System.out.print(a[i]+" ");
         }
         prev=a[i];
        }

    }
    
}
