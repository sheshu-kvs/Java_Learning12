import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int a1[]={10,4,5,1,3,4,2};
        int n=a1.length;

        for(int i=0;i<a1.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(a1[j]>a1[j+1]){
                    int temp=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a1));
    }
}
