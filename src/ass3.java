import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ass3 {

        public static List<Integer> solution(List<String[]> logs) {
            // Create a map to track the available items, their prices, and the order they were added
            Map<String, List<int[]>> inventory = new HashMap<>();
            List<Integer> revenue = new ArrayList<>();

            for (String[] log : logs) {
                String transactionType = log[0];
                String itemName = log[1];

                if (transactionType.equals("supply")) {
                    int count = Integer.parseInt(log[2]);
                    int price = Integer.parseInt(log[3]);
                    inventory.computeIfAbsent(itemName, k -> new ArrayList<>()).add(new int[]{price, count});
                } else if (transactionType.equals("sell")) {
                    int count = Integer.parseInt(log[2]);
                    int revenueFromSell = 0;

                    while (count > 0 && inventory.containsKey(itemName)) {
                        List<int[]> prices = inventory.get(itemName);
                        int[] cheapest = prices.get(0);
                        int cheapestPrice = cheapest[0];
                        int cheapestCount = cheapest[1];

                        if (cheapestCount >= count) {
                            revenueFromSell += count * cheapestPrice;
                            cheapest[1] -= count;
                            if (cheapest[1] == 0) {
                                prices.remove(0);
                            }
                            count = 0;
                        } else {
                            revenueFromSell += cheapestCount * cheapestPrice;
                            count -= cheapestCount;
                            prices.remove(0);
                        }

                        if (prices.isEmpty()) {
                            inventory.remove(itemName);
                        }
                    }
                    revenue.add(revenueFromSell);
                } else if (transactionType.equals("return")) {
                    int count = Integer.parseInt(log[2]);
                    int sellPrice = Integer.parseInt(log[3]);
                    int newPrice = Integer.parseInt(log[4]);

                    inventory.computeIfAbsent(itemName, k -> new ArrayList<>()).add(new int[]{newPrice, count});
                }
            }
            return revenue;
        }

        public static void main(String[] args) {
            List<String[]> logs = new ArrayList<>();
            logs.add(new String[]{"supply", "item1", "2", "100"});
            logs.add(new String[]{"supply", "item2", "3", "60"});
            logs.add(new String[]{"sell", "item1", "1"});
            logs.add(new String[]{"sell", "item1", "1"});
            logs.add(new String[]{"sell", "item2", "2"});
            logs.add(new String[]{"return", "item2", "1", "60", "40"});
            logs.add(new String[]{"sell", "item2", "1"});
            logs.add(new String[]{"sell", "item2", "1"});

            List<Integer> revenue = solution(logs);
            System.out.println(revenue);  // Output: [100, 100, 120, 40, 60]
        }
    }


