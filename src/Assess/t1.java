package Assess;

import java.util.*;

public class t1 {
    public static List<Integer> getRecommendedFriends(int n, List<List<Integer>> friendships) {
//        // Graph to store friends of each user
//        Map<Integer, Set<Integer>> friends = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            friends.put(i, new HashSet<>());
//        }
//
//        // Building the friendship graph
//        for (List<Integer> pair : friendships) {
//            int u = pair.get(0);
//            int v = pair.get(1);
//            friends.get(u).add(v);
//            friends.get(v).add(u);
//        }
//
//        List<Integer> recommendations = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            Map<Integer, Integer> commonFriendCount = new HashMap<>();
//            for (int friend : friends.get(i)) {
//                for (int potential : friends.get(friend)) {
//                    if (potential != i && !friends.get(i).contains(potential)) {
//                        commonFriendCount.put(potential, commonFriendCount.getOrDefault(potential, 0) + 1);
//                    }
//                }
//            }
//
//            // Finding the recommendation
//            int maxCommon = 0;
//            int recommendation = -1;
//            for (Map.Entry<Integer, Integer> entry : commonFriendCount.entrySet()) {
//                int candidate = entry.getKey();
//                int count = entry.getValue();
//                if (count > maxCommon || (count == maxCommon && candidate < recommendation)) {
//                    maxCommon = count;
//                    recommendation = candidate;
//                }
//            }
//            recommendations.add(recommendation);
//        }
//        return recommendations;

        List<Set<Integer>> friends = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            friends.add(new HashSet<>());
        }

        // Building the friendship graph
        for (List<Integer> pair : friendships) {
            int u = pair.get(0);
            int v = pair.get(1);
            friends.get(u).add(v);
            friends.get(v).add(u);
        }

        List<Integer> recommendations = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int maxCommon = 0;
            int recommendation = -1;
            for (int j = 0; j < n; j++) {
                if (i != j && !friends.get(i).contains(j)) {
                    int commonCount = 0;
                    for (int friend : friends.get(i)) {
                        if (friends.get(j).contains(friend)) {
                            commonCount++;
                        }
                    }
                    if (commonCount > maxCommon ||
                            (commonCount == maxCommon && j < recommendation)) {
                        maxCommon = commonCount;
                        recommendation = j;
                    }
                }
            }
            recommendations.add(recommendation);
        }
        return recommendations;


    }
    public static void main(String[] args) {
        List<List<Integer>> friendships = new ArrayList<>();
//        friendships.add(Arrays.asList(0, 1));
//        friendships.add(Arrays.asList(0, 2));
//        friendships.add(Arrays.asList(1, 3));
//        friendships.add(Arrays.asList(2, 3));
//        friendships.add(Arrays.asList(3, 4));

            friendships.add(Arrays.asList(0, 1));
    //        friendships.add(Arrays.asList(1, 2));
    //        friendships.add(Arrays.asList(2, 0));
        friendships.add(Arrays.asList(0, 2));

        List<Integer> recommendations = getRecommendedFriends(5, friendships);
        System.out.println(recommendations);
    }
}
