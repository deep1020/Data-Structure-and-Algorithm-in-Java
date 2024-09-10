package Divide_and_Conquer;

public class longest_increasing_subsequence {
    public static int binarySearch(int arr[],int left, int right, int target){
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[]={2, 1, 6, 4, 5, 9, 3, 7, 8}; // 1,4,5,7,8
        int left=0;
        int right=arr.length-1;
        int len=0;
        int result[]=new int[arr.length];
        for(int num:arr){
            int i=binarySearch(result,0,len,num);
            result[i]=num;
            if(i==len){
                len++;
            }
        }
        System.out.println(len);
    }
}
// T.C -> O(nlogn) iterates through each element of the input array arr[].
// Inside this loop, the binarySearch() function, which has a time complexity of O(logn), where n = number of elements in the result[] array.
// S.C -> O(n) array result[] to store the increasing subsequence. The size of this array is the same as the input array arr[]