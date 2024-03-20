package Leetcode;

public class MinOperationsToEqual {

        public static int minOperations(int x, int y) {
        int operations = 0;

        while (x != y) {
            if (x > y) {
                if (x % 11 == 0) {
                    x /= 11;
                } else if (x % 5 == 0) {
                    x /= 5;
                } else {
                    x--;
                }
            } else {
                x++;
            }
            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        // Example 1
        int x1 = 26, y1 = 1;
        System.out.println("Example 1 Output: " + minOperations(x1, y1));

        // Example 2
        int x2 = 54, y2 = 2;
        System.out.println("Example 2 Output: " + minOperations(x2, y2));

        // Example 3
        int x3 = 25, y3 = 30;
        System.out.println("Example 3 Output: " + minOperations(x3, y3));
    }
}
