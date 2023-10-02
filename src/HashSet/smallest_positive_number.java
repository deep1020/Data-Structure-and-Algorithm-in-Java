package HashSet;

import java.util.HashSet;

public class smallest_positive_number {
    static int smallestPositiveNumber(int nums[]){
        HashSet<Integer> positiveIntegers = new HashSet<>();
        // Store positive integers in the HashSet
        for (int num:nums) {
            if (num>0) {
                positiveIntegers.add(num);
            }
        }
        // Find the smallest positive integer not in the HashSet
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!positiveIntegers.contains(i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(smallestPositiveNumber(nums));
    }
}
