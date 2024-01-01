import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {34, 21, 54, 65, 43};
        int[] arr2 = {4, 3, 6, 7, 1};

        int secondLargest1 = findSecondLargest(arr1);
        int secondLargest2 = findSecondLargest(arr2);

        System.out.println("Output 1: " + secondLargest1);
        System.out.println("Output 2: " + secondLargest2);
    }

    static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}
