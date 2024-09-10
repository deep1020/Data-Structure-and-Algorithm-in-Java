package Uber_Assessment;

public class que3 {
    public static int solution(int[][] matrix) {
        int n = matrix.length;
        int[][][] cost = new int[3][3][n * n];

        // Precompute the cost to change each cell to either 0, 1, or 2
        for (int y = 0; y < 3; y++) {
            for (int b = 0; b < 3; b++) {
                if (y == b) continue;
                int index = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j || i == n - 1 - j || (i >= n / 2 && j == n / 2)) {
                            cost[y][b][index++] = matrix[i][j] == y ? 0 : 1;
                        } else {
                            cost[y][b][index++] = matrix[i][j] == b ? 0 : 1;
                        }
                    }
                }
            }
        }

        int minChanges = Integer.MAX_VALUE;
        for (int y = 0; y < 3; y++) {
            for (int b = 0; b < 3; b++) {
                if (y == b) continue;
                minChanges = Math.min(minChanges, dpCost(cost[y][b], n));
            }
        }

        return minChanges;
    }

    private static int dpCost(int[] cost, int n) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];

        for (int i = 1; i < cost.length; i++) {
            dp[i] = dp[i - 1] + cost[i];
        }

        return dp[cost.length - 1];
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 0, 2, 0, 2},
                {1, 2, 1, 2, 0},
                {0, 1, 2, 1, 0},
                {0, 0, 2, 1, 1},
                {1, 1, 2, 1, 1}
        };
        System.out.println(solution(matrix)); // Output should be 2
    }
}
