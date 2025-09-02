public class ArrayPalindrome {
    public static void main(String[] args) {
       int a1[]={3,4,5,6,3};
       int a2[]={1,2,4,5,6,9};
       PrintArrayPalin(a1,a2);
    }
    private static void PrintArrayPalin(int a1[],int a2[]){
     int i=0,j=0;
     while(i<a1.length && j<a2.length){
        if(a1[i]==a2[j]){
            System.out.println(a1[i]);
            i++;
            j++;
        }
        else if(a1[i]>a2[j]){
            j++;
        }
        else{
            i++;
        }
     }
    }
}
