public class SumWithAlternateSigns {
    public static void main(String[] args) {
        int n = 10;
        int result = sumWithAlternateSigns(n);
        System.out.println("Sum with alternate signs: " + result);
    }

    static int sumWithAlternateSigns(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 2 == 0 ? -1 : 1) * n + sumWithAlternateSigns(n - 1);
    }
}
