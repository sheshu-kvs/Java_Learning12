
public class Day17Coding {

    static void UpperCaseFirstLettar() {
        String str = "java,morin,selva";
        String stringWords[] = str.split(",");
        StringBuilder sb = new StringBuilder();
        for (String word : stringWords) {
            String t = "";
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (i == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(ch);
                }

            }
            if (!word.equals(stringWords[stringWords.length - 1]));
            {
                sb.append(" ");
            }

        }
        System.out.println(sb);
    }

    static void WithoutSb() {
        String str = "rahul,rain,partiban";
        String stringWords[] = str.split(",");
        String result = "";
        for (String word : stringWords) {
            String currentWord = "";
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (i == 0) {
                    currentWord = currentWord + Character.toUpperCase(ch);

                } else {
                    currentWord = currentWord + ch;
                }
            }
            result = result + currentWord;

            if (!word.equals(stringWords[stringWords.length - 1])) {
                result = result + " ";
            }

        }
        System.out.println(result);
    }

    static void firstLettarAndLast() {
        String str = "word";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(0);
            int temp = ch;

        }
        System.out.println(str.length() - 1);
    }

    public static void main(String[] args) {
        // UpperCaseFirstLettar();
        // WithoutSb();
        firstLettarAndLast();
    }
}
