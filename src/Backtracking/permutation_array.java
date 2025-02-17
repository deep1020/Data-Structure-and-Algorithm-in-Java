package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class permutation_array {

    static List<List<Integer>> getAllSubArrays(int arr[]){
        List<List<Integer>> resultList=new ArrayList<>();
        backtrack(resultList,new ArrayList<>(),arr,0);
        return resultList;
    }
    static void backtrack(List<List<Integer>> resultList, List<Integer> tempList,int arr[],int start){
        if(start==arr.length){
            return;
        }
        for(int end=start;end<arr.length;end++){
            tempList.add(arr[end]);
            resultList.add(new ArrayList<>(tempList));
            backtrack(resultList,tempList,arr,end+1);
            tempList.remove(tempList.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> resultList=getAllSubArrays(arr);
        System.out.println(resultList);
    }
}
// Input: arr=[1,2,3]
// Output: [[1],[1,2],[1,2,3],[2],[2,3],[3]]

// Que: Why we need to remove last element or character after DFS recursive call in all backtracking problems?
// Here we have removed last added element tempList.remove(tempList.size()-1)
// Ans: When you add an element to tempList, you explore all subarrays that start with that element
// After finishing the exploration for that path, you need to revert tempList to its previous state (before adding that element)
// so that you can explore the next possible element in the array
// Without removing the last element, the tempList would continue to grow and would not reflect the correct subarrays for different recursive paths

// By removing the last element, you ensure that the next recursive call starts with the correct subarray.
// Otherwise, you would just keep adding elements to the same subarray, generating incorrect results.

// static void generateAllSubarrays(int arr[],int start,int end){
//        if(end==arr.length){
//            return;
//        }
//        else if(start>end){
//            generateAllSubarrays(arr,0,end+1);
//        }
//        else{
//            for(int i=start;i<end;i++){
//                System.out.print(arr[i]+",");
//            }
//            System.out.println(arr[end]);
//            generateAllSubarrays(arr,start+1,end);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={1,2,3};
//        generateAllSubarrays(arr,0,0);
//    }