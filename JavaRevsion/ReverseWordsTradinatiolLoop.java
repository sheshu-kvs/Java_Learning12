public class ReverseWordsTradinatiolLoop {
    public static void main(String[] args) {
         String str="this is the Java language";


         String t="";
         for(int i=0;i<str.length();i++){
            t=str.charAt(i)+t;
         }
         System.out.println(" "+t);
    }
    
}
