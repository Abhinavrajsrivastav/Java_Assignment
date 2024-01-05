public class MaxValueInArray {
    public static void main(String[] args) {
        int[] array = {13, 1, -3, 22, 5};
        int maxValue = findMaxValue(array);
        System.out.println("Max value in the array: " + maxValue);
    }

    static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
