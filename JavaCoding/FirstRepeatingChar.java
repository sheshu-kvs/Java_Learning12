package JavaCoding;

import java.util.Arrays;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str="programing";
        int count=1;
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        System.out.println(str+" ");
        for(int i=0;i<str.length()-1;i++){
            // char ch=str.charAt(i);
            // System.out.print(" ");
            // if(str.indexOf(ch)!=str.lastIndexOf(ch)){
            //     System.out.println(ch);
            //     break;
            //   System.out.print(str.indexOf(ch));
                        //  0 1 2 0 0
           //   System.out.print(str.lastIndexOf(ch));
                       //   4 1 2 4 4
              
              if(ch[i]==ch[i+1]){
                // System.out.println(ch[i]);
                count++;
              }
              else{
                if(count>1){
                    System.out.println(ch[i]);
                }
                count=1;
              }
            }
            if(count>1){
                System.out.println(ch[ch.length-1]);
            }
        }
        }
    
