import java.util.Arrays;

public class MoveZerosatEnd {
    static void MoveZerosAtEnd(int a[]){
        int nonzer=0;
        for(int i=0;i<a.length;i++){
           if(a[i]!=0){
             a[nonzer++]=a[i];
           }
        }
        while(nonzer<a.length){
            a[nonzer++]=0;
        }
        System.out.println("Array Values "+Arrays.toString(a));
    }

    static void MoveZerosatFirst(int a[]){
        int nonzer=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                a[nonzer--]=a[i];
            }
        }
        while (nonzer>=0) {
            a[nonzer--]=0;
        }
           System.out.println("Array Values "+Arrays.toString(a));
    }

    static int Gcd(int n1,int n2){
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2 % i==0){
                return i;
            }
        }
        return -1;
    }
    static void lcm(int n1,int n2){
        int res=0;
        int resofgcd=Gcd(n1, n2);
        res=(n1*n2)/resofgcd;
        System.out.println("res "+res);

    }
    public static void main(String[] args) {
        // int a[]={0,1,3,0,1};
        // MoveZerosAtEnd(a);
        // MoveZerosatFirst(a);
        Gcd(12,18);
        lcm(12, 18);
    }
}
