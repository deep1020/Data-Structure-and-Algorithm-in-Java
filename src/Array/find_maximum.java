package Array;

import java.util.Arrays;

public class find_maximum {
    static int largest(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,6,7,3,1};
        System.out.println(largest(arr));
    }
}
// T.C -> O(n)
// S.C -> O(1)

//int arr[]={3,2,6,8,4};
//for(int i=1;i<arr.length;i++){
//    if(arr[i]>arr[0]){
//        arr[0]=arr[i];
//    }
//}
//System.out.println("Largest element in an array: "+arr[0]);

//Arrays.sort(arr);
//System.out.println(arr[arr.length-1]);
//T.C -> O(nlogn)
//S.C -> O(1)