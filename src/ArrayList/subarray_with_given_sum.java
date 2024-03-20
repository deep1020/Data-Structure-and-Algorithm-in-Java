package ArrayList;

import java.util.ArrayList;

public class subarray_with_given_sum {
    static ArrayList<Integer> subarraySum(int arr[],int n,int s){
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int right=0;
        int sum=0;
        while(right<=n){
            if(sum<s){
                sum+=arr[right];
                right++;
            }
            else if(sum>s){
                sum-=arr[left];
                left++;
            }
            else{
                list.add(left+1);
                list.add(right);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,7,6};
        int sum=14;
        ArrayList<Integer> list=subarraySum(arr,arr.length,sum);
        System.out.println(list.get(0)+" "+list.get(1));
    }
}
