package Two_Pointers;

import java.util.ArrayList;
import java.util.List;

public class kth_element_of_sorted_array {
    public static int kthElement(int arr1[],int arr2[],int k){
        int left=0;
        int right=0;
        List<Integer> list=new ArrayList<>();
        while(left< arr1.length && right< arr2.length){
            if(arr1[left]<arr2[right]){
                list.add(arr1[left]);
                left++;
            }
            else{
                list.add(arr2[right]);
                right++;
            }
        }
        while(left< arr1.length){
            list.add(arr1[left]);
            left++;
        }
        while(right< arr2.length) {
            list.add(arr2[right]);
            right++;
        }
        if (k-1<list.size()) {
            return list.get(k - 1);
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr1[] = { 3, 4, 7, 11, 14 };
        int arr2[] = { 1, 5, 8, 10 };
        int k=5;
        System.out.println(kthElement(arr1,arr2,k));
    }
}
// T.C -> O(n+m) while loop iterates through both arrays once, which takes O(m + n) time.
// operations inside the while loop (adding elements to the list) take constant time.
// S.C -> O(n+m) additional space used is proportional to the combined lengths of the two arrays.

// T.C -> O(logn+logm) where ‘n’ is the number of elements in ‘arr1’ and ‘m’ is the number of elements in 'arr2'.
// We do binary search on both the arrays independently, hence the complexity is order of log(n)
// S.C -> O(1) it uses constant space