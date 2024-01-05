import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return -1; // No majority element
    }
}
