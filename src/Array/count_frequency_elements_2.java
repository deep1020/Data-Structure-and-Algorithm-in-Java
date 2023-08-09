package Array;

import java.util.Arrays;

public class count_frequency_elements_2 {
    public static void main(String[] args) {
        int arr[]={4,7,2,7,8,4,7,2};
        countOccurence(arr);
    }
//    static void countOccurence(int arr[]){
//        Arrays.sort(arr);
//        // 2 2 4 4 7 7 7 8
//        for(int i=0;i<arr.length;i++){
//            int count=1;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//                else
//                    break;
//            }
//            System.out.println(arr[i]+ " -> " +count);
//            i=i+count-1;
//        }
//    }
// T.C -> O(nlogn)
// S.C -> O(1)
    static void countOccurence(int arr[]) {
        Arrays.sort(arr);
        // 2 2 4 4 7 7 7 8
        int count = 1;
        for (int i=0;i<arr.length;i++) {
            if (i<arr.length && arr[i]==arr[i+1]) {
                count++;
            } else {
                System.out.println(arr[i] + " -> " + count);
                count = 1;
            }
        }
    }
}
// T.C -> O(nlogn)
// S.C -> O(1)