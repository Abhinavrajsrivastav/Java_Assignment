import java.util.*;

public class UniquePermutations {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};

        System.out.println(findUniquePermutations(nums1)); // Output: [[1,1,2], [1,2,1], [2,1,1]]
        System.out.println(findUniquePermutations(nums2)); // Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    }

    static List<List<Integer>> findUniquePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);

        return result;
    }

    static void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, result);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
