import java.util.HashSet;

public class ArrarRepe{
    public static void main(String[] args){
        int a1[]={1,1,2,3,3,4};

        HashSet<Integer> h1=new HashSet<>();
        for(int a2:a1){
            h1.add(a2);
        }

        System.out.println(h1);
    }
}