public class SumOfArrayValues {
    public static void main(String[] args) {
        int[] array = {92, 23, 15, -20, 10};
        int sum = findSumOfArray(array);
        System.out.println("Sum of array values: " + sum);
    }

    static int findSumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
