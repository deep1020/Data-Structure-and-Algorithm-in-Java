package Divide_and_Conquer;

public class kth_element_of_sorted_array {
    static int kth(int arr1[], int arr2[], int start_arr1, int end_arr1, int start_arr2, int end_arr2, int k)
    {
        // Base case: If one array is empty, return kth element from the other array
        if (start_arr1 == end_arr1){
            return arr2[k];
        }
        if (start_arr2 == end_arr2){
            return arr1[k];
        }
        // Calculate the middle indices of the two arrays
        int m1 = (end_arr1 - start_arr1) / 2;
        int m2 = (end_arr2 - start_arr2) / 2;

        // If the sum of middle indices is less than k
        if (m1 + m2 < k)
        {
            // Compare the middle elements of the two arrays
            if (arr1[m1] > arr2[m2])
                // Recursively search in the second half of the second array
                return kth(arr1, arr2, start_arr1, end_arr1, start_arr2 + m2 + 1, end_arr2, k - m2 - 1);
            else
                // Recursively search in the second half of the first array
                return kth(arr1, arr2, start_arr1 + m1 + 1, end_arr1, start_arr2, end_arr2, k - m1 - 1);
        }
        else
        {
            // If the sum of middle indices is greater than or equal to k
            if (arr1[m1] > arr2[m2])
                // Recursively search in the first half of the first array
                return kth(arr1, arr2, start_arr1, start_arr1 + m1, start_arr2, end_arr2, k);
            else
                // Recursively search in the first half of the second array
                return kth(arr1, arr2, start_arr1, end_arr1, start_arr2, start_arr2 + m2, k);
        }
    }

    // Method to find the kth element in two sorted arrays
    static int kthElement(int arr1[], int arr2[], int n, int m, int k)
    {
        // Call the recursive method to find the kth element
        return kth(arr1, arr2, 0, n, 0, m, k - 1);
    }
    public static void main(String[] args) {
        int arr1[] = { 3, 4, 7, 11, 14 };
        int arr2[] = { 1, 5, 8, 10 };
        int k=5;
        System.out.println(kthElement(arr1,arr2,arr1.length,arr2.length,k));
    }
}
// T.C -> O(logn+logm) where ‘n’ is the number of elements in ‘arr1’ and ‘m’ is the number of elements in 'arr2'.
// We do binary search on both the arrays independently, hence the complexity is order of log(n)
// S.C -> O(1) it uses constant space