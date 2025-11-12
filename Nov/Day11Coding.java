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
    static void patternIncreasingOrder(){
        int num=1;
        for(int i=1;i<5;i++){
            for(int j=0;j<i;j++){
               System.out.print(num+" ");
               num++;
            }
            System.out.println(" ");
        }
    }
    static void StarPaterrn(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ReverseStarPatern(){
        for(int i=5;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pyramid(){
        for(int i=1;i<5;i++){
            for(int k=0;k<4-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
        static void  hallowpyramid(){
        for(int i=1;i<=5;i++){
            for(int k=0;k<5-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j == 1||j == 2*i-1 || i == 5){
                System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void hallowtriangle(){
         for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                // System.out.print("* ");
                if(i==4||j==0||j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // CountDuplicatesInString();
        // patternIncreasingOrder();
        // StarPaterrn();
        // ReverseStarPatern();
        // pyramid();
        // hallowpyramid();
        hallowtriangle();
    }
}
