import java.util.Arrays;

public class Day25Coding {
    static void FindSum(){
        int a[]={2,7,11,15};
        int k=18;
        for(int i=0;i<a.length-1;i++){
            if(a[i]+a[i+1]==k){
                System.out.println("(" +i+","+(i+1)+")");
            }
        }
    }

    static void FindMissingNum(){
        int a[] = {1,2,3,4,5,7};
        int num = 7;
        int sum = num*(num+1)/2;
        int actual = 0;
        for(int a12:a){
           actual += a12;
        }
        System.out.println("Missing Value "+(sum  - actual));
    }
    static void findOccuranc(){
        String str="banana";
        String a[] = new String[str.length()];
        int k=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            a[k++]=String.valueOf(ch);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int count=1;
        for(int j=0;j<a.length-1;j++){
          if(a[j] .equals(a[j+1])){
            count++;
          }
          else{
            System.out.println(a[j]+" : "+count);
            count=1;
          }
        }
        System.out.println(a[a.length-1]+":"+count);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        // for (int size = 1; size < a.length; size++) {
        //     for (int i = 0; i < a.length-size; i++) {
        //         for (int j = 0; j < i+size; j++) {
        //             System.out.print(a[j] + " ");
        //         }
        //         System.out.println();
        //     }
        // }
        // FindSum();
        // FindMissingNum();
        findOccuranc();

    }

}
