import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 9, 0, 9, 2, 2, 1, 1, 8, 94 };
        int size = 3;
        printSubArray(num, size);
    }

    private static void printSubArray(int num[], int size) {
    
        for (int i = 0; i <= num.length - size; i++) {
                StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + size; j++) {
                System.out.print(num[j] + " ");
                // sb.append(num[j]);
            }
            System.out.println(" ");
            // int val = Integer.parseInt(sb.toString());
            // if (ispalin(val)) {
            //     System.out.println("Palindrome NUmbers " + val);
            // }
        }
    }

    private static boolean ispalin(int a1) {

        int rev = 0;
        int original = a1;
        while (a1 > 0) {
            int rem = a1 % 10;
            rev = rev * 10 + rem;
            a1 = a1 / 10;
        }
        if (original == rev) {
            return true;
        } else {
            return false;
        }

    }
}
