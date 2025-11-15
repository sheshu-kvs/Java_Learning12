import java.util.ArrayList;
import java.util.Arrays;

public class Day15Coding {
    
static boolean  checkIfArrayIsConsequative(){
  int a[] = {5, 6, 7, 8,11};
  int prev=a[0];
  boolean val = false;
  for(int i=1;i<a.length;i++){
    if(a[i]-prev==1){
     val = true;
    }
    else{
      val = false;
    }
    prev=a[i];
  }
  if(val){
    return true;
  }
  else{
    return false;
  }
}

/*Medium Consequative Array Probelms */

static void PrintAllConsequativeGropus(){
  int a[] = {0, 1, 2, 5, 6, 10, 11, 12};
  int prev = a[0];
  System.out.print(prev+" ");
  for(int i=1;i<a.length;i++){
    if(a[i]-prev==1){
      System.out.print(a[i]+" ");
    }
    else{
      System.out.println();
      System.out.print(a[i]+" ");
    }
    prev=a[i];
  }
}
static void printLongestConsequative(){
  int a[]={4, 2, 1, 6, 5};
  Arrays.sort(a);
  System.out.println(Arrays.toString(a));
  int prev = a[0];
  System.out.print(prev+" ");
  int max = 0,count=0;
  for(int i=1;i<a.length;i++){
    if(a[i]-prev==1){
      // System.out.print(a[i]+" ");
      count++;
    }
    else{
      // System.out.println();
      // System.out.print(a[i]+" ");
    }

  
    prev=a[i];
    
    }
}



static void secondlargest(){
  int a[]={10, 5, 20, 8, 30};
  int p=0,vp=0;
  for(int i=0;i<a.length;i++){
    if(a[i]>p){
      vp=p;
      p=a[i];
    }
    else if(a[i]>vp){
      vp=a[i];
    }
  }
  System.out.println("Second Largest Element "+vp);
}
static void CheckPalindrome(){
  String str="madam";
  String t="";
  for(int i=str.length()-1;i>=0;i--){
    char ch = str.charAt(i);
    t=t+ch;
  }
  if(t.equals(str)){
    System.out.println("Palindrome ");
  }
  else{
    System.out.println("Not Palindrom");
  }
}

static void reverseSentence(){
  String str="I love Java";
  String t="";
  for(int i=str.length()-1;i>=0;i--){
    char ch = str.charAt(i);
     t=t+ch;
  }
  ArrayList<String> a1=new ArrayList<>();
  String [] words = t.split(" ");
  StringBuilder sb = new StringBuilder();
  String rever="";
  for(String word : words){
    for(int i=word.length()-1;i>=0;i--){
     char ch = word.charAt(i);
     rever=rever+ch;
    }
  }

  // String Converted = sb.append(rever)+" ";
  // System.out.println(Converted);
  System.out.println(a1);

}

static String  reverse(String str){

  String t="";
  for(int i=str.length()-1;i>=0;i--){
    char ch = str.charAt(i);
    t=t+ch;
  }
  return t;
}
    public static void main(String[] args) {

          // System.out.println(checkIfArrayIsConsequative());
          //  PrintAllConsequativeGropus();
          // printLongestConsequative();
          // secondlargest();
          // CheckPalindrome();
          reverseSentence();
        
    }
    
}
