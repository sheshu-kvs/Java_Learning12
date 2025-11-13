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



    public static void main(String[] args) {
          thirdLargestWord();
        // int p=0,vp=0,tp=0;
            
}
}
