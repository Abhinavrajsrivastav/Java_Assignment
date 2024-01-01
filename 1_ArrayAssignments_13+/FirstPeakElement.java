public class FirstPeakElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 6, 5};
        int[] arr2 = {1, 4, 7, 3, 2, 6, 5};

        int peak1 = findFirstPeak(arr1);
        int peak2 = findFirstPeak(arr2);

        System.out.println("Output 1: " + peak1);
        System.out.println("Output 2: " + peak2);
    }

    static int findFirstPeak(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        return -1; // No peak found
    }
}
