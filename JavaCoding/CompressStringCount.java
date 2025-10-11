package JavaCoding;

import java.util.HashMap;
import java.util.Map;

public class CompressStringCount {
    static void usingHashMap(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int c = map.get(ch);
                map.put(ch, c + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> e1 : map.entrySet()) {

            System.out.print(e1.getKey() + "" + e1.getValue());
        }

    }

    static void usingTraditionaLoop(String str) {
        int count = 1;
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                count++;
            } else {
                System.out.print(ch[i] + "" + (count++));
                count = 1;
            }
 
        }
           System.out.println(ch[ch.length-1]+""+count);
    }

    public static void main(String[] args) {
        String str = "aaabb";
        // usingHashMap(str);
        usingTraditionaLoop(str);
    }
}