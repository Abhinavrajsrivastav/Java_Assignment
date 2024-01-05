import java.util.*;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops1 = {"5", "2", "C", "D", "+"};
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};

        System.out.println(calPoints(ops1)); // Output: 30
        System.out.println(calPoints(ops2)); // Output: 27
    }

    static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}
