package JavaRevsion;

import java.util.Arrays;

public class OccurNormal {
    public static void main(String[] args) {
        int a1[]={3,2,2,12,12,2,4,5,6,7};
        Arrays.sort(a1);
         int count=1;
        //  System.out.println(Arrays.toString(a1));
        for(int i=0;i<a1.length-1;i++){
            if(a1[i]==a1[i+1]){
                count++;
            }
            else{
                System.out.println(a1[i]);
                count=1;
            }
            // System.out.println(a1[a1.length-1]);
            // count=1;
        }
       
      

    }
    
}
