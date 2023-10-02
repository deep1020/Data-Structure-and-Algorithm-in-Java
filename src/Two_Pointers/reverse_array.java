package Two_Pointers;

public class reverse_array {
    static void reverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverseArray(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
// T.C -> O(n)
// 6,2,3,4,5,1
// 6,5,3,4,2,1
// 6,5,4,3,2,1