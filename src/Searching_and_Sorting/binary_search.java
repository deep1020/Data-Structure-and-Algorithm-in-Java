package Searching_and_Sorting;

public class binary_search {
	public static void binarySearch(int arr[], int low, int high, int target) {
	   while(low <= high) {  
		  int mid = (low + high)/2;
	      if (arr[mid] == target ) {  
	    	  System.out.println(target + " is found at index: " + mid);
			  break;
	      }else if (arr[mid] < target ) {
	    	  low = mid + 1;
	      }else {  
	    	  high = mid - 1;  
	      }
	   }
	   if (low > high){
			System.out.println(target + " is not found!");
	   }
	 }  
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50}; // array must be sorted
        int target = 40;
        int low = 0;
        int high = arr.length-1;
        binarySearch(arr,low,high,target);
	}
}
