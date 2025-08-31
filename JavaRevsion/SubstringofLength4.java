public class SubstringofLength4 {
    public static void main(String[] args) {
        String str="Helloworld";
        // String repla=str.replaceAll("\\s","");
        // System.out.println(repla);
        int size=4;
        for(int i=0;i<=str.length()-size;i++){
            String t="";
            for(int j=i;j<size+i;j++){
                t=t+str.charAt(j);
            }
            System.out.println(t);
        }
    }
}
