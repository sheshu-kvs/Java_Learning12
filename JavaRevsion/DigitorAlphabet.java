package JavaRevsion;

public class DigitorAlphabet {
    public static void main(String[] args) {
        String s1="HelloWorld1214@!#$#$";
       for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        if(!Character.isLetterOrDigit(ch)){
            System.out.println(ch);
        }
      
       }
    }
    
}
