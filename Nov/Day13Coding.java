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

    static  int consecutiveArray(){
      int a[]={0,2,8,1,2,3,8,9};
      for(int i=0;i<a.length-1;i++){
        if(a[i+1]-a[i]==1){
          System.out.println(a[i]);
        }
      }
      return -1;
    }

    public static void main(String[] args) {
          // thirdLargestWord();
          consecutiveArray();
}
}

