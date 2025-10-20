package JavaRevsion;

public class Pyramid {

    static void HallowPyramid(int num) {
        System.out.println(" Pyramid");
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num - i + 1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == num) {
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }

    static void Fullpyramid(int num) {
        System.out.println("Pyramid");
        for (int i = 1; i <= num; i++) {
            for (int k = 0; k < num - i + 1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        }

        static void  Triangle(int num){
            System.out.println("Pyramid");
            for(int i=0;i<num;i++){
                for(int j=0;j<=i;j++){
                 System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    static void ReverseTriangle(int num){
        for(int i=num;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void hallowTriangle(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    // Sum of digits until single digit (e.g., 99 → 9+9=18 → 1+8=9).
    public static void main(String[] args) {
        int num = 5;
        // Fullpyramid(num);
        // HallowPyramid(num);
        // Triangle(num);
        // ReverseTriangle(num);
        System.out.println(" ");
        hallowTriangle(num);

    }
}



