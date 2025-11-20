import java.util.ArrayList;
import java.util.Arrays;

public class Day20Coding {
    static void PrintAllSubArray(){
        int a[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        for(int size=1;size<=a.length;size++){
            for(int i=0;i<=a.length-size;i++){
                for(int j=i;j<i+size;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println(" ");
            }
        }

    }

    static void maxSum(){
        int a[]={1,2,3,4,5};
        int size=2;
       
           int max=0;
         int maxStartIdx =0;
        for(int i=0;i<=a.length-size;i++){
            int sum = 0; 
            for(int j=i;j<i+size;j++){
              sum = sum +a[j];
            }
            if(sum>max){
            max=sum;
            maxStartIdx=i;
            }
        }

        System.out.println("Printing the Max Values ");
       for(int k=maxStartIdx;k<maxStartIdx+size;k++){
         System.out.print(a[k]+" ");
       }
       System.out.println();
    }

     static void PrintingMaxSum(){
        ArrayList a123 = new ArrayList<>();
        // −2,1,−3,4,−1,2,1,−5,4
        a123.add(-2);
        a123.add(1);
        a123.add(-3);
        a123.add(4);
        a123.add(-1);
        a123.add(2);
        a123.add(1);
        a123.add(-5);
        a123.add(4);

      
         int max=0;
         int maxStartIdx =0;
    //   for(int size=1;size<=a123.size();size++){
          for(int i=0;i<=a123.size()-4;i++){
            int sum = 0; 
            for(int j=i;j<i+4;j++){
              sum += (Integer)a123.get(j);
            //   System.out.print(a123.get(j)+" ");
            }
            // System.out.println( );
            if(sum>max){
            max=sum;
            maxStartIdx=i;
            }
        }
      System.out.println("Printing the Max Values ");
      System.out.println("Max Val "+max);
       for(int k=maxStartIdx;k<maxStartIdx+4;k++){
         System.out.print(a123.get(k)+" ");
       }
       System.out.println();
      }


      static void SubArraySumEqualK(){
        int a [] = {1,2,3};
        int k = 3; 
        int count = 0;
        for(int i=0;i<=a.length-1;i++){
            int sum  = 0;
            for(int j=0;j<i+1;j++){
                sum = sum+a[j];
                count++;
                System.out.print(a[j]+" ");
            }
            System.out.println(" ");
            if(sum==k){
               System.out.println("Count Equals "+count);
            }
        }
      }
      
    // }


    public static void main(String[] args) {
       
        //  maxSum();
        // PrintingMaxSum();
        SubArraySumEqualK();
    }
    
}
