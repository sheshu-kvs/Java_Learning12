public class LongestSubArray {
    public static void main(String[] args) {
          int num[] = { 1, 2, 1,2,1,5,1 };
        //  int size=3;
         prinatSubAllSub(num);
    }
    private static void prinatSubAllSub(int a[]){
        // for(int size=1;size<=a.length;size++){
        for(int size=a.length-1;size>=1;size--){
             for(int i=0;i<=a.length-size;i++){
                StringBuilder sb=new StringBuilder();
              for(int j=i;j<i+size;j++){
                // System.out.print(a[j]+" ");
                sb.append(a[j]);
              }
              int val=Integer.parseInt(sb.toString());
              if(ispalin(val)){
                System.out.println("Longest SubArray "+ val +" ");
                return;
              }
            //   System.out.println(" ");
             }
        }
    }

      private static boolean ispalin(int num){
        int rev=0;
        int original=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(original==rev){
            return true;
        }
        else{
            return false;
        }

    }
    
    
}

    