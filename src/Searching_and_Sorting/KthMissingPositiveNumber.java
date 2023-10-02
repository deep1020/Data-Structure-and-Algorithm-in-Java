package Searching_and_Sorting;

public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missingNumbers = arr[mid] - mid - 1;
            if (missingNumbers < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;  // 1,5,6,8,9 output -> 9
        int result = findKthPositive(arr, k);
        System.out.println(result);
    }
}

