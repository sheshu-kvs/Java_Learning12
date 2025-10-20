public class NumberOccuranceOfSubString {
   
    public static void main(String[] args) {
        String   str1="mississippi";
        String str2="issi";
        String res=Substring(str1, str2);
        System.out.println(res);
        
    }
     public static String Substring(String str1,String str2) {
     int count=0;
        for(int i=0;i<str1.length()-4;i++){
            String t="";
            for(int j=i;j<i+4;j++){
                t=t+str1.charAt(j);
        }
        if(t.equals(str2)){
            count++;
        }
    }
       return "The count of the substring:"+count;
}
}
    
