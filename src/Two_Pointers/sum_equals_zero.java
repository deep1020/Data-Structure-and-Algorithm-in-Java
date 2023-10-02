package Two_Pointers;

public class sum_equals_zero {
    static void sumZero(int arr[]){
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==0){
                System.out.println(arr[left]);
                System.out.println(arr[right]);
                break;
            }
            else if(sum<=0){
                left++;
            }
            else {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-9,-4,-1,1,4,8,11};
        sumZero(arr);
    }
}
