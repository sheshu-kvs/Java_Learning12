public class MaxandMinElementArray {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        printMax(a1);
        printMin(a1);

    }

    private static void printMin(int[] a1) {
        int max=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]>max){
                max=a1[i];
            }
        }
        System.out.println("Max Value"+ max);
    }

    private static void printMax(int[] a1) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a1.length;i++){
            if(a1[i]<min){
                min=a1[i];
            }
        }
        System.out.println("Min Value"+ min);
    }
    
}
