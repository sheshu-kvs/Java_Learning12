package JavaCoding;

public class ReplaceSpacesString {
    public static void main(String[] args) {
        String str="      java        helo";
        String trimed=str.trim();
        String val=trimed.replaceAll("\\s","");

        System.out.println(val);
    }
    
}
