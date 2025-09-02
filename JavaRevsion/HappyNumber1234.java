public class HappyNumber1234 {
    public static void main(String[] args) {
        int num = 19;
        if (ishappy(num)) {
            System.out.println("Entered Number is the Happy Number " + num);
        } else {
            System.out.println("Entered Number is not the Happy Number " + num);
        }

    }

    private static int SquareNum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += (rem * rem);
            num = num / 10;
        }
        return sum;

    }

    private static boolean ishappy(int num) {
        while (num != 1) {
            num = SquareNum(num);
        }
        return num == 1;
    }
}
