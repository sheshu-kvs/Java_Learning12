public class nonRepe {
    public static void main(String[] args) {
        String str="swqmm";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((str.indexOf(ch)==str.lastIndexOf(ch))){
                System.out.println("Non Repeating: "+ch);
                return;
            }
        }
    }
}
