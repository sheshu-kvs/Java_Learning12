import java.util.ArrayList;
import java.util.Arrays;

public class CountFacotrs{

    static int[] mergeTwoArrays(){
        int a1[]={1,2,3,4};
        int a2[]={2,4,5,5};
        int n1=a1.length;
        int n2=a2.length;
        // System.out.println("VALUES"+a1.length);
        int a3[]=new int[n1+n2];
        System.out.println(a3.length);

        int i=0,j=0,k=0;

        while(i<a1.length && j<a2.length){
            if(a1[i]>a2[j]){
                a3[k++]=a1[i++];
            }
            else{
                 a3[k++]=a2[j++];
            }
        }

        while(i<a1.length){
            a3[k++]=a1[i++];
        }
        while (j<a2.length) {
            a3[k++]=a1[j++];
        }

        return a3;
    }

    static void bubbleSort(){
      
        int a[]=mergeTwoArrays();
          int n=a.length;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


    static void removeDuplicates(int a[]){
        int count=1;
        int k=0;
        ArrayList j=new ArrayList<>();
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                if(count==1){
                // System.out.println("Duplicate Values"+a[i]);
                // j[k++]=a[i];
                j.add(a[i]);
                }
                count=1;
            }
        }
        if(count==1){
            // System.out.println("Duplicate Values "+a[a.length-1]);
                // j[k++]=a[a[a.length-1]];
                j.add(a[a.length-1]);
        }
        // System.out.println(Arrays.toString(j
        System.out.println(j);
    }
    static void CountDup(int a[]){
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                System.out.println(a[i]+":"+count);
                count=1;
            }
        }
    }
    static void SecondLargest(){
        int a[]={2,1,3,6,7};
        int p=0,vp=0,tp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>p){
                tp=vp;
                vp=p;
                p=a[i];
            }
            else if(a[i]>vp){
                vp=a[i];
            }
          
        }
        // System.out.println("Second Largest "+vp);
        System.out.println("Third Largest "+tp);
    }
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,4,5,6,6,8};
        // CountDup(a);
        // removeDuplicates(a);
        // mergeTwoArrays();
        // bubbleSort();
        SecondLargest();
    }

}