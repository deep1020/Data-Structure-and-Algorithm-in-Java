package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_element {
    public static int[] removeElement(int[] nums,int val){
        // 1st way
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[idx]=nums[i];
                idx++;
            }
        }
        return Arrays.copyOf(nums,idx);

        // 2nd way
//        List<Integer> resultList=new ArrayList<>();
//        for(int num:nums){
//            if(num!=val){
//                resultList.add(num);
//            }
//        }
//        int resultArray[]=new int[resultList.size()];
//        for(int i=0;i<resultList.size();i++){
//            resultArray[i]=resultList.get(i);
//        }
//        return resultArray;

//        OR directly return resultList -> return resultList.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        int nums[]={3,2,2,3,1};
        int val=3;
        int result[]=removeElement(nums,val);
        System.out.println(Arrays.toString(result));
    }
}
