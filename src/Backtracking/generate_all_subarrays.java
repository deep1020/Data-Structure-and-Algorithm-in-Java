package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class generate_all_subarrays {

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