import java.util.*;

public class test1 {
    public static int maxPackagesOptimized(List<Integer> costs) {
        // Step 1: Create a TreeMap to maintain frequency of each item
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        for (int cost : costs) {
            freqMap.put(cost, freqMap.getOrDefault(cost, 0) + 1);
        }

        // Step 2: Try to form packages and maximize the number of valid packages
        int maxPackages = 0;

        // Iterate over all the possible sums of pairs
        for (int targetCost : freqMap.keySet()) {
            int currentPackages = 0;
            // Check all possible items to form pairs
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                int cost = entry.getKey();
                int complement = targetCost - cost;

                // If both cost and complement exist in the map, we can try to form a pair
                if (freqMap.containsKey(complement)) {
                    // If both are the same cost, we need at least two of them
                    if (cost == complement) {
                        currentPackages += freqMap.get(cost) / 2;
                    } else {
                        // Form pairs by taking the minimum count of both items
                        currentPackages += Math.min(freqMap.get(cost), freqMap.get(complement));
                    }
                }
            }
            // Keep track of the maximum number of packages formed
            maxPackages = Math.max(maxPackages, currentPackages);
        }

        return maxPackages;
    }

    public static void main(String[] args) {
        List<Integer> costs = Arrays.asList(10,2,1);
        System.out.println(maxPackagesOptimized(costs)); // Expected Output: 3
    }
}
