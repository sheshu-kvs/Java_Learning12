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

    if(count>max){
      max=count;
      for(int i=1;i<a.length;i++){
        if(a[i]-a[i-1]==1){
          System.out.print(a[i]+" ");
        }
        else{
          System.out.println();
          System.out.print(a[i]+" ");
        }
      }
    }

}
    public static void main(String[] args) {

          // System.out.println(checkIfArrayIsConsequative());
          //  PrintAllConsequativeGropus();
          printLongestConsequative();
        
    }
    
}
