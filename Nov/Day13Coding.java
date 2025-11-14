import java.lang.reflect.Array;
import java.util.Arrays;

public class Day13Coding {
    static void thirdLargestWord(){
          String a[] = {"coder","Java","newton"};
          String p="",vp="",tp="";
          int firstlen=0,secondLen=0;
          for(int i=0;i<a.length;i++){
            int len = a[i].length();
            if(len>firstlen){
                tp=vp;
                vp=p;
                p=a[i];
               
                firstlen=len;
            }
            else if(len>secondLen){
                vp=a[i];
                secondLen=len;
            }
          }
          System.out.println(tp);


      

    }

  static void consecutiveArray() {
    int a[] = {0,2,8,1,2,3,8,9};
    Arrays.sort(a);
    System.out.println(Arrays.toString(a)); // debug: sorted array

    int prev = a[0];
    System.out.print(prev + " ");


    int count = 0;
    for (int i = 1; i < a.length; i++) {
        if (a[i] == prev) {
            // duplichate - skip
            continue;
        }
        if (a[i] - prev == 1) {
            // continues the consecutive group
            System.out.print(a[i] + " ");
            count++;
        } else {
            // gap -> new line and start next group
            System.out.println();
            System.out.print(a[i] + " ");
        }
        prev = a[i]; // update last unique value
    }
    System.out.println("Largest Consquetive "+count);
}
static void printAllConsequativePairs(){
  int a[]={1,2,4,5,6};
 int prev = a[0];
 System.out.print(prev+" ");
 for(int i=1;i<a.length;i++){
  if(a[i]==prev){
    continue;
  }
  if(a[i]-prev == 1){
    System.out.print(a[i]+" ");
  }
  else{
    System.out.println();
    System.out.print(a[i]+" ");
  }
  prev=a[i];
 }
}


static void CountConsequativepair(){
  // int a[]={3, 4, 9, 10, 11, 20};
  int a[]={0, 1, 2, 5, 6, 10, 11, 12};
  int count = 0;
 int prev = a[0];
 Arrays.sort(a);
 System.out.println(Arrays.toString(a));
//  System.out.print(prev+" ");
 for(int i=1;i<a.length;i++){
  if(a[i]==prev){
    continue;
  }
  if(a[i]-prev == 1){
    System.out.print(a[i]+" ");
    // count++;
  }
  else{
    // count++;
    System.out.println();
    System.out.print(a[i]+" ");
  }
  prev=a[i];
 }
 System.out.println("The Consequative pairs "+count);
}




    public static void main(String[] args) {
          // thirdLargestWord();
          // consecutiveArray();
          // printAllConsequativePairs();
          CountConsequativepair();
}
}

