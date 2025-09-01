public class PrintAllSubarrays {
    public static void main(String[] args) {
          int num[] = { 1, 2, 1,2,1,5,1 };
        //  int size=3;
         prinatSubAllSub(num);
    }
    private static void prinatSubAllSub(int a[]){
        for(int size=1;size<=a.length;size++){
        // for(int size=a.length-1;size>=1;size--){
             for(int i=0;i<=a.length-size;i++){
              for(int j=i;j<i+size;j++){
                System.out.print(a[j]+" ");
              }
             
              System.out.println(" ");
             }
        }
    }

 
    
    
}
