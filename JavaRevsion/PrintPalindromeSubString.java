
public class PrintPalindromeSubString {
    public static void main(String[] args) {
        String str="mississippi";
        int size=2;
        PrintPalinSub(str,size);
        
    }
    private static void  PrintPalinSub(String str1,int size){
        for(int i=0;i<str1.length()-size;i++){
            String t="";
            for(int j=i;j<i+size;j++){
                t=t+str1.charAt(j);
            }
            if(palin(t)){
                System.out.println(" "+t+" ");
            }

        }

    }
    private static boolean palin(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);

        }
        if(t.equals(s)){
            return true;
        }
        return false;
    }
}
