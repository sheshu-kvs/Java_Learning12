package JavaCoding;

import java.util.LinkedHashSet;

public class dupliatecin {
    public static void main(String[] args) {
        int a[]={10,20,10,40,50,40,20,30,50};
        String s1="abacededebb";
        char[] ch=s1.toCharArray();

        // LinkedHashSet<Integer> map=new LinkedHashSet<>();
        // for(int aa:a){
        //     map.add(aa);
        // }


        LinkedHashSet<Character> map=new LinkedHashSet<>();

        for(char c123:ch){
            // System.out.println(c123);
            map.add(c123);
        }

        

        System.out.println(map);

    }
    
}
