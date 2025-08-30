public class Palin {
    public static void main(String[] args) {
        String str="Hello World";
        palin(str);
        
    }


    
      public static boolean palin(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);

        }
        if (t.equals(s)) {
            return true;
        }
        return false;
    }

}
