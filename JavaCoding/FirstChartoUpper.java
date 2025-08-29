package JavaCoding;

public class FirstChartoUpper {
    public static void main(String[] args) {
        String str="hello world  java";
        String []s1=str.split(" ");
        System.out.println();
        StringBuilder sb=new StringBuilder();
        for(String a1:s1){
            if(a1.isEmpty()){
                sb.append(" ");
                continue;
            }
           char firstChar=Character.toUpperCase(a1.charAt(0));
           String end=a1.substring(1);
           sb.append(firstChar).append(end).append(" ");
        }
        System.out.println(sb.toString().trim());
       
        // System.out.println(s1);
        // StringBuilder sb=new StringBuilder();
        //  for(String words:s1){
        //     System.out.print(words);
        //     if(words.isEmpty()){
        //         sb.append(" ");
        //         continue;
        //     }
        //        char firstChar=Character.toUpperCase(words.charAt(0));
        //        String remainingchars=words.substring(1);
        //        sb.append(firstChar).append(remainingchars).append(" "); 
        //  }
        //  System.out.println(" ");
        //  System.out.println(sb.toString().trim());
   
    }
}
