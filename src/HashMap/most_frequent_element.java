package HashMap;

import java.util.HashMap;
import java.util.Map;

public class most_frequent_element {
    static int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxCount=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getKey();
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[]={3,2,4,2,5,2,4};
        System.out.println("Most frequent element in array: "+majorityElement(nums));
    }
}
