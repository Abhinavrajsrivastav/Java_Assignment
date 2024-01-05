import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result ? "Yes." : "No");
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) <= 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }
}
