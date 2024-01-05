import java.util.Arrays;

public class DivideArrayIntoKSubsets {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 2};
        int k1 = 2;

        System.out.println(canDivideIntoSubsets(arr1, k1)); // Output: true
    }

    static boolean canDivideIntoSubsets(int[] arr, int k) {
        int sum = Arrays.stream(arr).sum();

        if (sum % k != 0) {
            return false;
        }

        int targetSum = sum / k;
        boolean[] used = new boolean[arr.length];

        return backtrack(arr, 0, used, k, 0, targetSum);
    }

    static boolean backtrack(int[] arr, int start, boolean[] used, int k, int currentSum, int targetSum) {
        if (k == 1) {
            return true;
        }

        if (currentSum == targetSum) {
            return backtrack(arr, 0, used, k - 1, 0, targetSum);
        }

        for (int i = start; i < arr.length; i++) {
            if (!used[i] && currentSum + arr[i] <= targetSum) {
                used[i] = true;
                if (backtrack(arr, i + 1, used, k, currentSum + arr[i], targetSum)) {
                    return true;
                }
                used[i] = false;
            }
        }

        return false;
    }
}
