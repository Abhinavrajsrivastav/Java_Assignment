public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int num1 = 153;
        int num2 = 134;

        System.out.println(isArmstrongNumber(num1) ? "Yes" : "No");
        System.out.println(isArmstrongNumber(num2) ? "Yes" : "No");
    }

    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNum;
    }
}
