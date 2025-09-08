package JavaRevsion;

public class MissingNumberArray {
    public static void main(String[] args) {
        // int a1[]={1, 2, 4};
        int a1[]={3, 0, 2};
        // int num=a1.length+1;      
        int num=a1.length;      
        int expected=(num*(num+1))/2;
        int sum=0;
        for(int val:a1){
            sum+=val;
        }
        // System.out.println(sum);
        // System.out.println(expected);
        System.out.println(expected-sum);
    }
}
