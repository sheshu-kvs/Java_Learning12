package JavaCoding;

public class FirstRepeChar {
    public static void main(String[] args) {
        String a="programming";
        System.out.println("Length"+a.length());
        int count=1;
        for(int i=0;i<a.length()-1;i++){
            if((a.charAt(i)==a.charAt(i+1))){
                System.out.println(" ");
                // System.out.println(a.charAt(i));
                count++;
                // break;
            }
            else{
             if(count==1){
            for(int j=0;j<a.length();j++){
                System.out.println(a.charAt(j));
               }
            }
            count=1;
            }
        }
       

        // for(int i=0;i<a.length();i++){
        //     char ch=a.charAt(i);
        //     // if(a.indexOf(ch){
        //         System.out.print("\n");
        //         // System.out.println(ch);
        //         System.out.print(" "+a.indexOf(ch));
        //         System.out.println("");
        //         System.out.print(" "+a.lastIndexOf(ch));
        //     }
        }
    }
    
