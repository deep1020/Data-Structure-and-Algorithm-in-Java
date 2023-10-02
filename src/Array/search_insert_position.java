package Array;

public class search_insert_position {
	
	static int find_index(int[] arr, int n, int K) {
	    for(int i = 0; i < n; i++) {
	     
	        if (arr[i] == K) {
	            return i;
	        }
	        else if (arr[i] > K) {
	        	return i;
	        }
	    }
	    return n;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
	    int n = arr.length;
	    int K = 5;
	     
	    System.out.println(find_index(arr, n, K));
	}

}
