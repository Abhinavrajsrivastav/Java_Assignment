import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";

        System.out.println(decodeString(s1)); // Output: "aaabcbc"
        System.out.println(decodeString(s2)); // Output: "accaccacc"
        System.out.println(decodeString(s3)); // Output: "abcabccdcdcdef"
    }

    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();

        int i = 0;
        String currentString = "";

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            } else if (ch == '[') {
                resultStack.push(currentString);
                currentString = "";
                i++;
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int repeatTimes = countStack.pop();

                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(currentString);
                }

                currentString = temp.toString();
                i++;
            } else {
                currentString += ch;
                i++;
            }
        }

        return currentString;
    }
}
