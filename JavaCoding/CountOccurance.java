package JavaCoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountOccurance {
    static void plaintNum(String num){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(map.containsKey(ch)){
                int c=map.get(ch);
                map.put(ch,c+1);

            }
            else{
                map.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> map1243:map.entrySet()){
            System.out.println(map1243.getKey()+" : "+map1243.getValue());
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,1,3,4,2,5,2};

        String num="9999991234567895555577777777444444333333333";
        plaintNum(num);
        printOccurWithArray(a);


    }
    private static void printOccurWithArray(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<a.length;i++){
        int val=a[i];
        if(map.containsKey(val)){
            int c=map.get(val);
            map.put(val,c+1);
        }
        else{
            map.put(val,1);
        }
       }
       for(Map.Entry<Integer,Integer> map123:map.entrySet()){

        int key=map123.getKey();
        int value=map123.getValue();
        System.out.println(key+" : "+value);

       }
    }
}
