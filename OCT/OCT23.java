public class OCT23 {
    static void reverseString(){
        String str="Hello Java";
        String t="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            t=t+ch;
        }
         System.out.println(t);

    }
    static void reverseStringusingWhile(){
           String str="Hello Java";
           String t="";
           int i=str.length()-1;
           while(i>=0){
            char ch = str.charAt(i);
            t=t+ch;
            i--;
           }
           System.out.println(t);
    }

    static void reverseStringUsingdowhile(){
        String str="Hello Java";
           String t="";
           int i=str.length()-1;
            do{
            char ch = str.charAt(i);
            t=t+ch;
            i--;
           }while(i>=0);
           System.out.println(t);
    }

    static void CountVowels(){
        String str="Hello Java";
        String lower = str.toLowerCase();
        String trimmed =lower.replaceAll(" ","");
        int count=0;
        int conso=0;
        for(int i=0;i<trimmed.length();i++){
           char ch=trimmed.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               count++;
            //    System.out.println(ch);
           }
           else{
            conso++;
                System.out.println("Res"+ch);
           }
        }
        // System.out.println(count);
        System.out.println(conso);
    }
    public static void main(String[] args){

        // reverseString();
        // reverseStringusingWhile();
        // reverseStringUsingdowhile();
        CountVowels();
    }
    
}
