package JavaRevsion;

public class ConvertingUpperLowercase {

    static void printLower(String str){
        String   t="";
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            if(ch>= 'A' && ch<= 'Z'){
                    t=t+(char)(ch+32);
                    // t=t+ch;
            }
             else{
                t=t+ch;
            }
        }
        System.out.println(" "+t);
    }
    static void printUpper(String str){
        String t="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch <='z'){
                t=t+(char)(ch-32);
            }
            else{
                t=t+ch;
            }
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        // String str="HELLO";
        String str="hello1234";
        String t="";
        // printLower(str);
        printUpper(str);
    }    
}
