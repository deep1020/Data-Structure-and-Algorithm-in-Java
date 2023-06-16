// finding maximum sum of a subarray of size k using sliding window
package Array;
import java.util.Map;
public class sliding_window {

    static int maxSum(int arr[],int k){
        int n=arr.length;
        if(n<k){
            System.out.println("Invalid");
            return -1;
        }
        int currentSum=0;
        //sum of first k(window size) elements
        for(int i=0;i<k;i++){
            currentSum+=arr[i];
        }
        int maximumsum=currentSum;
        // Calculating sums of remaining windows by removing first element of previous window
        // and adding last element of current window
        // If currentSum > maximumSum then update maximumSum to currentSum
        for(int i=k;i<n;i++){
            currentSum+=arr[i]-arr[i-k];
            maximumsum= Math.max(currentSum,maximumsum);
        }
        return maximumsum;
    }

    public static void main(String[] args) {
        int k=3; // window size
        int[] arr={16, 12, 9, 19, 11, 8};
        System.out.println("maximum sum of a subarray of size k is "+maxSum(arr,k));
    }
}
// T.C -> O(n)
// without using sliding window T.C -> O(k*n) as it contains two nested loops