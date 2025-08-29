package JavaRevsion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occur {
    public static void main(String[] args) {
        // String s1="asdasewaeqasdasddddddaaasdadccc";

        // HashMap<Character,Integer> map=new HashMap<>();

        // for(int i=0;i<s1.length();i++){
        //     char val=s1.charAt(i);
        //     if(map.containsKey(val)){
        //         int c=map.get(val);
        //         map.put(val,c+1);

        //     }
        //     else{
        //         map.put(val,1);
        //     }
        // }

        // for(Entry<Character, Integer> m1:map.entrySet()){
        //     if(m1.getValue()>1){            
        //     System.out.println(m1.getKey()+":"+m1.getValue());
        //     }
        // }

        String s="111132423555";

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);

            if(map.containsKey(val)){
                int  c=map.get(val);
                map.put(val,c+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(Entry<Character,Integer>m1:map.entrySet()){
            if(m1.getValue()>1){
                System.out.println(m1.getKey()+":"+m1.getValue());
            }
        }
    }
}
