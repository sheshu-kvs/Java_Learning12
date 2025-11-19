
import java.util.Arrays;
import java.util.HashSet;

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

    static void usingCharArrayforFirstTOLast(){
      String str="reva";
      char[] ch=str.toCharArray();
      char temp = ch[0] ;
      ch[0]=ch[ch.length-1];
      ch[ch.length-1]=temp;

      System.out.println("New String "+Arrays.toString(ch));
      String grandValueString = String.valueOf(ch);
      System.out.println(grandValueString);
    }

    static void mergeTwoArrays(){
      int a1[]={1,2,4,3};
      int a2[]={2,9,4,5};
      int res[] = new int[a1.length+a2.length];


      // to create the we need use the new keyword and the type of that array in the  right side we need to declare
      // 

      int i=0,j=0,k=0;
      while(i<a1.length&&j<a2.length){
         if(a1[i]<a2[j]){
            res[k++]=a1[i++];
         }
         else{
            res[k++]=a2[j++];

         }
      }
      while(i<a1.length){
         res[k++]=a1[i++];
      }
      while(j<a2.length){
         res[k++]=a2[j++];
      }



      System.out.println("Displying the Merged Array Values ");
      Arrays.sort(res);
      System.out.println(Arrays.toString(res));

      // System.out.println("Without Duplicates "+h1);

    }


      static void mergeArrayUsingFoRLoop(){
      int a1[]={1,2,4,3};
      int a2[]={2,9,4,5};
      int res[] = new int[a1.length+a2.length];


      // to create the we need use the new keyword and the type of that array in the  right side we need to declare
      // 
   // use the for loop when we know the how many times we need to increment
   // use the while loop we dont know the how many times we need to increments..[]

      //  int a1[]={1,2,4,3};
      //  int a2[]={2,9,4,5};
      int k=0;
      for(int i=0;i<a1.length;i++){
         res[k++]=a1[i];
      }
      
 

    for(int j=0;j<a2.length;j++){
      res[k++]=a2[j];
    }



      System.out.println("Displying the Merged Array Values ");
      Arrays.sort(res);
      System.out.println(Arrays.toString(res));

      HashSet h1=new HashSet<>();
      for(int val:res){
         h1.add(val);
      }

      // System.out.println("Without Duplicates "+h1);
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

        }
    }
    public static void main(String[] args) {
         // firstLettarAndLastUsngInbuiltMethods();
         // withoutUsingSubString();
         // UsingSubString();
         // usingCharArrayforFirstTOLast();
         // mergeTwoArrays();
         mergeArrayUsingFoRLoop();
 
    }



    
}
