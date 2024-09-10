package Uber_Assessment;
import java.util.*;

public class MyQue3 {
        static class Player {
            String name;
            int time;
            public Player(String name, int time) {
                this.name = name;
                this.time = time;
            }
        }
        public static List<String> solution(String[][] laps) {
            Comparator<Player> comp = new Comparator<Player>() {
                @Override
                public int compare(Player p1, Player p2) {
                    // First compare by time in decreasing order
                    int timeComparison = Integer.compare(p2.time, p1.time);
                    if (timeComparison != 0) {
                        return timeComparison;
                    }
                    // If times are the same, compare by name in alphabetical order
                    return p1.name.compareTo(p2.name);
                }
            };

            ArrayList<String> eliminatedPlayers = new ArrayList<>();
            HashSet<String> set = new HashSet<>();
            for (String[] lap : laps) {
                PriorityQueue<Player> pq = new PriorityQueue<>(comp);
                boolean flag = false;
                for (String s : lap) {
                    String[] parts = s.split(" ");
                    String name = parts[0];
                    int time = Integer.parseInt(parts[1]);
                    // Skip already eliminated drivers
                    if (!set.contains(name)){
                        pq.add(new Player(name, time));
                    }
                }
                if(pq.isEmpty()){
                    continue;
                }
                int slowestTime = pq.peek().time;

                while (!pq.isEmpty() && pq.peek().time == slowestTime) {
                    Player p = pq.poll();
                    eliminatedPlayers.add(p.name);
                    set.add(p.name);
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
                    {"Harold 151", "Gina 153", "Joy 160", "Eddie 160"},
                    {"Harold 149", "Joy 150", "Gina 152", "Eddie 154"},
                    {"Harold 148", "Gina 150", "Eddie 151", "Joy 155"}
            };
            List<String> result2 = solution(laps2);
            System.out.println(result2);
        }
}
