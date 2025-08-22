package JavaCoding;

public class SameArrayBoth {
    public static void main(String[] args) {
        int a1[]={10,20,30,40};
        int a2[]={40,10,60,70};

        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.println(" ");
                    System.out.println(a1[i]);
                }
            }
        }
    }
    
}
