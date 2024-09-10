package Queue;

import java.util.*;

public class top_k_frequent_words_comparator {
    static List<String> topKFrequent(String words[],int k){
        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)-> {
            int str1_freq=map.get(a);
            int str2_freq=map.get(b);
            if(str1_freq==str2_freq){
                return a.compareTo(b);
            }
            return str1_freq-str2_freq;
        });
        for(String word:map.keySet()){
            pq.offer(word);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> list=new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        return list;
    }
    public static void main(String[] args) {
        String nums[]={"i","love","leetcode","i","love","coding"};
        int k=2;
        System.out.println(topKFrequent(nums,k));
    }
}
