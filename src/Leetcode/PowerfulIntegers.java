package Leetcode;

public class PowerfulIntegers {

    public static int countPowerfulIntegers(int start, int finish, int limit, String s) {
        int count = 0;
        int suffixLength = s.length();
        long suffix = Long.parseLong(s);

        for (int i = start; i <= finish; i++) {
            long current = i;
            boolean isPowerful = true;

            // Check if each digit in x is at most limit
            while (current > 0) {
                int digit = (int) (current % 10);
                if (digit > limit) {
                    isPowerful = false;
                    break;
                }
                current /= 10;
            }

            // Check if s is a suffix of x and x is powerful
            if (isPowerful && i % (int) Math.pow(10, suffixLength) == suffix) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example 1
        int start1 = 1, finish1 = 6000, limit1 = 4;
        String s1 = "124";
        System.out.println("Example 1 Output: " + countPowerfulIntegers(start1, finish1, limit1, s1));

        // Example 2
        int start2 = 15, finish2 = 215, limit2 = 6;
        String s2 = "10";
        System.out.println("Example 2 Output: " + countPowerfulIntegers(start2, finish2, limit2, s2));

        // Example 3
        int start3 = 1000, finish3 = 2000, limit3 = 4;
        String s3 = "3000";
        System.out.println("Example 3 Output: " + countPowerfulIntegers(start3, finish3, limit3, s3));
    }
}
