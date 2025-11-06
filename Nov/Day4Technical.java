package Nov;

public class Day4Technical {
    
    public static void main(String[] args) {
        String str="Hello";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // System.out.println(str.indexOf(ch));
            System.out.println(str.lastIndexOf(ch));
        }
        
    }
    
}
