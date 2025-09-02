public class PresentRepeated {
    public static void main(String[] args) {
        String str="swags";
        String str2="swags";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.print(str.indexOf(ch)+" ");
        }

        System.out.println(" ");
         for(int i=0;i<str2.length();i++){
            char ch=str.charAt(i);
            System.out.print(str.lastIndexOf(ch)+" ");
        }

        //  for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        // //    System.out.print(str.indexOf(ch)+" ");
        //      if(str.indexOf(ch)==str.lastIndexOf(ch)){
        //         System.out.println("Non Repeated First Character "+ch);
        //         return;
        //      }
        // }

        // System.out.println("Repeated Character was the ");

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch) != str.lastIndexOf(ch)){
                 System.out.println("Repeated First Character was "+ch);
                 return;
            }
        }


            // ===Non Repeated  last Character was the 


            for(int k=str.length()-1;k>=0;k--){
                // char ch122=str.charAt(k);
                char[] ch=str.toCharArray();
               if(ch[k] != ch[k+1]){

               }
            }
        }
    
}
