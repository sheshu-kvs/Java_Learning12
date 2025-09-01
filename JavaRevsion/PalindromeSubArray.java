public class PalindromeSubArray {
    public static void main(String[] args) {
         int num[] = { 1, 2, 3, 4, 5, 9, 0, 9, 2, 2, 1, 1, 8, 94 };
         int size=3;
         prinatSubString(num,size);
    }
    private static void prinatSubString(int num[],int size){
        for(int i=0;i<num.length-size;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<i+size;j++){
                sb.append(num[j]);
        }
        int val=Integer.parseInt(sb.toString());
        if(ispalin(val)){
            System.out.println("Palindrome Numbers "+val);
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
