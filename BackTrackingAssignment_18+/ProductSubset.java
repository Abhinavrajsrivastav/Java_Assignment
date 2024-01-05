import java.util.*;
    import java.util.*;

public class ProductSubset {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 2, 5, 4};
        int target1 = 16;

        System.out.println(isProductSubsetEqual(arr1, target1)); // Output: true
    }

    static boolean isProductSubsetEqual(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < (1 << n); i++) {
            int product = 1;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                   
                    product *= arr[j];
                }
            }
        }
        return false;

    }
}

    
        
                   
