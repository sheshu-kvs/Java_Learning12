

public class LongestSubString {
    public static void main(String[] args) {
        String str="mississippi";
        printSub(str);
        // System.out.println(s);
    }
    private static void  printSub(String s){
        for(int size=s.length();size>=1;size--){
            for(int i=0;i<s.length()-size;i++){
                String t="";
              for(int j=i;j<i+size;j++){
                 t=t+s.charAt(j);
              }
              if(palin(t)){
                System.out.println("Longest SubString:"+t);
                return;
              }
            }
        }
    }




      public static boolean palin(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);

        }
        if (t.equals(s)) {
            return true;
        }
        return false;
    }
    
}
