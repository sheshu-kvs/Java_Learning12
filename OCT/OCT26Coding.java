public class OCT26Coding {
    static void longest(){
        String a[]={"daru","deva","mohin","jaduravin","Alibasha"};
        int max=0;
        int index=0;
        // System.out.println("Res "+a[0].length());
        for(int i=0;i<a.length;i++){
            if(a[i].length()>max){
                max=a[i].length();
                index=i;
            }
        }
        System.out.println(" Longest Word "+a[index]);
    } 

    static void FirstRepeatingChar(){
        String str="java homega";
        for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          if(str.indexOf(ch) != str.lastIndexOf(ch)){
            System.out.println("First Repeating Character "+ch);
            break;
          }
        }

    }
    static void CountDigitsString(){
        String str="hello123";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!(Character.isLetter(ch))){
                count++;
            }
        }
        System.out.println("The Number Digits in the String "+count);
    }
    public static void main(String[] args) {
        // longest();
        // FirstRepeatingChar();
        CountDigitsString();
    }

}
