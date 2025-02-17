package Queue;

import java.util.*;

public class sort_character_by_frequency {
    static String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b)->Integer.compare(b[1],a[1])); // maxHeap
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int[] arr=new int[]{entry.getKey(),entry.getValue()};
            pq.offer(arr);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            int[] arr=pq.poll();
            for(int i=0;i<arr[1];i++){
                sb.append((char)arr[0]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }
}
// Perform: sorts a string based on the frequency of its characters in decreasing order
// 1) Build a frequency map:
// Iterate through the characters of the string
// Use a HashMap to store the frequency of each character
// Key: Character from the string
// Value: Count of occurrences
// 2) Prepare a Max-Heap (PriorityQueue):
// Use a PriorityQueue to order characters by frequency in decreasing order
// Store each character and its frequency as an integer array [char, frequency] in the heap
// Comparator: Sort based on frequency (b[1] - a[1] ensures descending order)
// 3) Build result string:
// Extract elements from the heap in descending frequency order
// For each character, append it to the result StringBuilder as many times as its frequency
// Convert the result to a string and return

// T.C -> O(n+klogk)
// 1) Building Frequency Map: O(n), where n is the length of the string
// 2) Building Priority Queue: O(klogk), where k is the number of unique characters
// Inserting each of the k elements into the heap costs logk
// 3) Building the Result String: O(n), as each character is appended based on frequency
// S.C -> O(n+k)
// Frequency Map: O(k), where k is the number of unique characters
// Priority Queue: O(k), for storing character-frequency pairs
// Result StringBuilder: O(n), to store the result