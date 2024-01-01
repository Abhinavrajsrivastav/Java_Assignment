
public class TraverseEvenElements {
    public static void main(String[] args) {
        int[] arr1 = {34, 21, 54, 65, 43};
        int[] arr2 = {4, 3, 6, 7, 1};

        System.out.print("Output 1: ");
        printEvenElements(arr1);

        System.out.print("Output 2: ");
        printEvenElements(arr2);
    }

    static void printEvenElements(int[] arr) {
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
