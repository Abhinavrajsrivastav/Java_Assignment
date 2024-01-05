import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};

        System.out.println(Arrays.toString(asteroidCollision(asteroids1))); // Output: [5, 10]
        System.out.println(Arrays.toString(asteroidCollision(asteroids2))); // Output: []
        System.out.println(Arrays.toString(asteroidCollision(asteroids3))); // Output: [10]
    }

    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0 || stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int top = stack.pop();
                    if (top == Math.abs(asteroid)) {
                        break;
                    } else if (top > Math.abs(asteroid)) {
                        stack.push(top);
                        break;
                    }
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
