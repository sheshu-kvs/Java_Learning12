
public class PrintAllSubString {
    public static void main(String[] args) {
        String str = "Helloworlda";
        // for(int size=1;size<=str.length();size++){
        printAllSub(str);
        // }

    }

    private static void printAllSub(String str) {
        for (int size = 1; size <= str.length(); size++) {
            for (int i = 0; i <= str.length() - size; i++) {
                String t = "";
                for (int j = i; j < i + size; j++) {
                    t = t + str.charAt(j);
                }
                // System.out.println(t);
                if(palin(t)){
                System.out.println(t);
                }
            }
        }
    }

    protected static boolean palin(String s) {
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
