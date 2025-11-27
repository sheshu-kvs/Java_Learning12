
public class Day27Coding {

    static void countSpcaesAddWord() {
        String str = "Hel     ll   o";
        // String replace = str.replace(" ","");
        // System.out.println(replace);
        int count = 0;
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
                t = t + "a";
            } else {
                t = t + ch;
            }

        }
        System.out.println("Count The Spaces " + count);
        System.out.println("Count The Spaces " + t);
    }

    static void CountVowels() {
        String str = "hello Aweworld";
        int count = 0;
        String lower = str.toLowerCase();
        System.out.println(lower);
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Count The Vowels " + count);

    }

    static void printVowels() {
        String str = "hello Aweworld";
        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.println(ch);
            }

        }
    }

    static void ConvertLower() {
        String str = "HEla";
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // System.out.println((char)ch+32);
            // t=t+(char)(ch+32);
            if (ch >= 'A' && ch <= 'Z') {
                t = t + (char) (ch + 32);
            } else {
                t = t + ch;
            }

        }
        System.out.println("Lower Case String " + t);
    }

    static void ConvertUpper() {
        String str = "hEla";
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // System.out.println((char)ch+32);
            // t=t+(char)(ch+32);
            if (ch >= 'a' && ch <= 'z') {
                t = t + (char) (ch - 32);
            } else {
                t = t + ch;
            }

        }
        System.out.println("Lower Case String " + t);
    }

    static void AddStarBeforeTheVowel() {
        String str = "banana";
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                t = t + "*" + ch;
            } else {
                t = t + ch;
            }
        }
        System.out.println("String Word " + t);
    }

    static void GenerateSubString() {
        String str = "mississipi";
        int size = 2;
        for (int i = 0; i <= str.length() - size; i++) {
            // String t="";
            for (int j = i; j < i + size; j++) {
                char ch = str.charAt(j);
                System.out.print(ch + " ");
            }
            System.out.println();

        }
    }

    static void GeneratePalinSubString() {
        String str = "mississippi";
        for (int size = 1; size < str.length(); size++) {
            for (int i = 0; i <= str.length() - size; i++) {
                String t = "";
                for (int j = i; j < i + size; j++) {
                    char ch = str.charAt(j);
                    // System.out.print(ch+" ");
                    t = t + ch;
                }
                if (checkpalindrom(t)) {
                    System.out.print(t);
                }
                System.out.println();
            }
        }
    }

    static boolean checkpalindrom(String str) {
        String t = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            t = t + ch;
        }
        if (t.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    static void logestPalinSubString() {
        String str = "mississippi";
        for (int size = str.length() - 1; size >= 0; size--) {
            for (int i = str.length() - size; i >= 0; i--) {
                String t = "";
                for (int j = i; j < i + size; j++) {
                    char ch = str.charAt(j);
                    // System.out.print(ch+" ");
                    t = t + ch;
                }
                if (checkpalindrom(t)) {
                    System.out.print("Longest SubString " + t);
                    return;
                }
                // System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // countSpcaesAddWord();
        // CountVowels();
        // printVowels();
        // ConvertLower();
        // ConvertUpper();
        // AddStarBeforeTheVowel();
        // GenerateSubString();
        // GeneratePalinSubString();
        logestPalinSubString();
    }
}
