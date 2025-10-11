package JavaCoding;

public class LongestWord{
    public static void main(String[] args) {
        String valu[]= {"Java" ,"Launches","TwoThreefourfive ","New", "Versionsop", "in", "the", "Year"};
        int max=0;
        String word="";
        for(String val:valu){
        
          if ((val.length()>max)) {
            max=val.length();
            word=val;
          }
        }
        // System.out.println(valu[max]);
        // System.out.println(" "+valu[count]);
        System.out.println(" "+max);
        System.out.println(" "+word);
    }
}