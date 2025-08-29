

public class ReverseWords {
    public static void main(String[] args) {
        String str="This is the Ocean of the Java";
        String s1[]=str.split(" ");
        for(String words:s1){
            for(int i=words.length()-1;i>=0;i--){
                System.out.print(words.charAt(i));
            }
            System.out.print(" "+" ");
        }
        System.out.println();
    }
}
