package Searching_and_Sorting;

public class binary_search {
	public static int binarySearch(int arr[], int low, int high, int target) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid; // Return the index directly
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50}; // array must be sorted
		int target = 40;
		int low = 0;
		int high = arr.length - 1;
		int result = binarySearch(arr, low, high, target);

		if (result == -1) {
			System.out.println(target + " is not present in the array");
		} else {
			System.out.println(target + " is present at index " + result);
		}
	}
}
