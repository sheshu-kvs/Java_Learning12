import java.util.Arrays;

public class Day11Coding {
    static void CountDuplicatesInString(){
        String str[] = {"a","b","c","d","e","c"};
        Arrays.sort(str);
        int count=1,duplicateCount=1;
        for(int i=0;i<str.length-1;i++){
            if(str[i]==str[i+1]){
              count++;
            }
            else{
                if(count>1){
                    System.out.println(str[i]);
                    duplicateCount++;
                }
                count=1;
            }
        }
        System.out.println(duplicateCount);

    }
    static void pattern(){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=i;j++){
               
            }
        }
    }

    public static void main(String[] args) {
        CountDuplicatesInString();
        pattern();
    }
}
