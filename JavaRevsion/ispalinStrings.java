package JavaRevsion;

import java.util.HashSet;

public class ispalinStrings {
    public static void main(String[] args) {
        String str="qqwqwwedei";

        Ispalint(str);

    }
    private static void Ispalint(String s){
        int n=s.length();
        boolean [][]palinNum=new boolean[n][n];

        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                   if (j - i < 2) {
                        // check single char and the both are palin
                        palinNum[i][j] = true;
                    } else {
                        // check the first index and the last index is same is also the palin
                       palinNum[i][j] = palinNum[i + 1][j - 1];
                    }
                }
            }
        }
         
        HashSet h1=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(palinNum[i][j]){
                    String valu=s.substring(i, j+1);
                    h1.add(valu);
                }
            }
        }
        System.out.println("Palindrome Substring:"+h1);
    }
    
}
