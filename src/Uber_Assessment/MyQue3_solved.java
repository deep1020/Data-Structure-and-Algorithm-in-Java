package Uber_Assessment;
import java.util.*;
public class MyQue3_solved {
    public static List<String> solution(String[][] laps) {
        List<String> eliminatedPlayers = new ArrayList<>();
        Set<String> eliminatedSet = new HashSet<>();

        for (String[] lap : laps) {
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((e1, e2) -> {
                // First compare by time in decreasing order
                int timeComparison = Integer.compare(e2.getValue(), e1.getValue());
                if (timeComparison != 0) {
                    return timeComparison;
                }
                // If times are the same, compare by name in alphabetical order
                return e1.getKey().compareTo(e2.getKey());
            });

            for (String s : lap) {
                String[] parts = s.split(" ");
                String name = parts[0];
                int time = Integer.parseInt(parts[1]);

                // Skip already eliminated drivers
                if (!eliminatedSet.contains(name)) {
                    pq.add(new AbstractMap.SimpleEntry<>(name, time));
                }
            }

            if (pq.isEmpty()){
                continue;
            }

            int slowestTime = pq.peek().getValue();

            while (!pq.isEmpty() && pq.peek().getValue() == slowestTime) {
                Map.Entry<String, Integer> entry = pq.poll();
                eliminatedPlayers.add(entry.getKey());
                eliminatedSet.add(entry.getKey());
            }
        }

        return eliminatedPlayers;
    }

    public static void main(String[] args) {
        String[][] laps1 = {
                {"Harold 154", "Gina 155", "Juan 160"},
                {"Gina 153", "Harold 160", "Juan 152"},
                {"Harold 148", "Gina 150"}
        };
        List<String> result1 = solution(laps1);
        System.out.println(result1); // Output: [Juan, Harold, Gina]
        String[][] laps2 = {
                {"Gina 155", "Eddie 160", "Joy 161", "Harold 163"},
                {"Harold 171", "Gina 153", "Joy 160", "Eddie 160"},
                {"Harold 149", "Joy 150", "Gina 152", "Eddie 154"},
                {"Harold 148", "Gina 150", "Eddie 151", "Joy 155"}
        };
        List<String> result2 = solution(laps2);
        System.out.println(result2);
    }
}
