import java.util.Arrays;

public class Day16Coding {
static void printLongestConsequative(){
  int a[]={4, 2, 1, 6, 5,7};
  Arrays.sort(a);
  System.out.println(Arrays.toString(a));
  int prev = a[0];
//   System.out.print(prev+" ");
  int max = 1,count=1;
  int ei=0;
  for(int i=1;i<a.length;i++){
    if(a[i]-prev==1){
      count++;
    }
    else{
        if(count>max){
            max=count;
            ei=i;
        }
     count=1;
    }
    
    prev=a[i];
    
    }
        if(count>max){
                max=count;
                ei=a.length-1;
        }
      int st=ei-max+1;

      for(int i=st;i<=ei;i++){
        System.out.print(""+a[i]+" ");
      }
}
static void CountingLongestConsequative(){
  int a[]={4, 2, 1, 6, 5,7};
  Arrays.sort(a);
  System.out.println(Arrays.toString(a));
  int prev = a[0];
//   System.out.print(prev+" ");
  int max = 0,count=1;
  int ei=0;
  for(int i=1;i<a.length;i++){
    if(a[i]-prev==1){
      count++;
    }
    else{
        if(count>max){
            max=count;
        }
     count=1;
    }
    
    prev=a[i];
    
    }
    System.out.println("Largest consetive Count "+count);

}

static void printAllConsequativePairs(){
    int a[]={1, 3, 4, 5, 7, 8};
       /*(3,4)
        (4,5)
        (7,8) */
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    int prev = a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]-prev==1){
            System.out.println(prev+":"+a[i]);
        }
        else{
            // System.out.println();
            // System.out.print(a[i]+" ");
        }
        prev = a[i];
    }
}
static void allConsequativeGroups(){
    int a[]={1, 2, 3, 5, 6, 9, 10, 11};
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
        prev = a[i];
    }
}

public static void main(String[] args) {
    // printLongestConsequative();
    // CountingLongestConsequative();
    // printAllConsequativePairs();
    allConsequativeGroups();
}
}
