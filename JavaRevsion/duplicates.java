 package JavaRevsion;

import java.util.HashSet;

class duplicates {
    public static void main(String[] args) {
        String a1="123333333333412223312334345678923929";
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<a1.length();i++){
            char ch=a1.charAt(i);
            map.add(ch);
        }
        System.out.println(map);
    }

    
}