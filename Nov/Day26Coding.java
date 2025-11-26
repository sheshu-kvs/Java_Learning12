
import java.util.ArrayList;
import java.util.Arrays;

public class Day26Coding {
    static void moveevenElmentFront(){
        int a[]={2,3,5,4,7};
        ArrayList a1=new ArrayList();
        int a3[] =new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                // System.out.println(a[i]);
                // a1.add(a[i]);
                a3[k++]=a[i];
            }
            // else{
            //     a3[k++]=a[i];
            // }
            
        }

        for(int j=0;j<a.length;j++){
            if(a[j]%2!=0){
                a3[k++]=a[j];
            }
        }

        // System.out.println(a1);
        System.out.println(Arrays.toString(a3));
    }

    static void removeDuplicatesArray(){
        int a[]={1,2,2,3,1};
        Arrays.sort(a);
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                if(count>1){
                    System.out.println(a[i]);
                }
                count=1;
            }
        }
        System.out.println(a[a.length-1]);
    }

    static void checkStringAngarms(){
        String s1="listen";
        String s2="silent";

        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println("Two Strings are the equal "+Arrays.equals(ch1, ch2));
    
    }

    static void PatternPrint(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void ReversePatternPrint(){
        for(int i=5;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void combine2patterns(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=5;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rectangel(){
        System.out.println();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hallowRectangle(){
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0 ||i==4 || j==0 || j==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // moveevenElmentFront();
        // removeDuplicatesArray();
        // checkStringAngarms();
        // PatternPrint();
        // ReversePatternPrint();
        // combine2patterns();
        // rectangel();
        // hallowRectangle();
    }
    
}
