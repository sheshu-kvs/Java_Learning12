public class Day9Coding {
    static void FirstCharToUpper(){
        String str="merin,morya,chand";
        String words[] = str.split(",");
          String t="";
        for(String word:words){
          
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(i==0){
                //   t=t+Character.toUpperCase(ch);
                sb.append(Character.toUpperCase(ch));
                }
                else{
                    sb.append(ch);
                }
            }
            // System.out.println("First Lettar Upper Case "+sb);
            t=t+sb+" ";
        }
        System.out.println("First Lettar To UpperCase "+t);

    }
    public static void main(String[] args) {
        FirstCharToUpper();
        
    }
    
}
