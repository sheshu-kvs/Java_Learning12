public class nonRepe {
    public static void main(String[] args) {
        String str="wqmm";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(str.indexOf(ch)==str.lastIndexOf(ch))){
                System.out.println("Repeating:"+ch);
                break;
            }
        }
    }
}
