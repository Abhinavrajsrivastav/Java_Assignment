import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        printPermutations(arr1);
    }

    static void printPermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        
        System.out.println(result);
    }

    static void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}
