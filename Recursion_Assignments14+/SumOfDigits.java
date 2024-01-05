public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int result = sumOfDigits(n);
        System.out.println("Sum of digits: " + result);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}
