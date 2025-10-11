package JavaCoding;

public class WithPrac {
    static void SecondLarge(int a[]){
        int p=0,vp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>p){
              vp=p;
              p=a[i];
            }
            else if(a[i]>vp){
                vp=a[i];
            }
        }
        System.out.println(vp+p);
    }0
    public static void main(String[] args) {
        int a[]={12,34,5,5,6};
        System.out.println("Values ");
        SecondLarge(a);
    }
}
