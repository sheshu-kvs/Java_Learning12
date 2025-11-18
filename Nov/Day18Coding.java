public class Day18Coding {
     static void firstLettarAndLastUsngInbuiltMethods() {
        String str = "word";
        String result="";
          
           String middle="";
         for (int i = 0; i < str.length(); i++) {
            char  first = str.charAt(0);
             char lastval = str.charAt(str.length()-1);
             middle = str.substring(1,str.length()-1);
             result=lastval+middle+first;
        }
        System.out.println("Result of the Swap "+result); 
    }

    static void UsingSubString(){
      String str = "rahul,rain,partiban";
      String stringwords[] = str.split(",");
      String res="";
      for(String word:stringwords){
        
         for(int i=0;i<word.length();i++){
               char first = word.charAt(0);
               char last = word.charAt(word.length()-1);
               String middle = word.substring(1,word.length()-1);
               res=last+middle+first;
         } 
         System.out.println(res);
      }
      
    }
    
    static void withoutUsingSubString(){
      String str = "rahul,rain,partiban";
      String stringwords[] = str.split(",");
      String res="";
      for(String word:stringwords){
        
         for(int i=0;i<word.length();i++){
               char first = word.charAt(0);
               char last = word.charAt(word.length()-1);
               String middle = word.substring(1,word.length()-1);
               res=last+middle+first;
         } 
         System.out.println(res);
      }
      
    }
    public static void main(String[] args) {
         // firstLettarAndLastUsngInbuiltMethods();
         withoutUsingSubString();
         // UsingSubString();
 
    }
    
}
