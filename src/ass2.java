import java.util.*;
public class ass2 {

    static class SellTransaction {
        String itemName;
        int count;

        public SellTransaction(String itemName, int count) {
            this.itemName = itemName;
            this.count = count;
        }
    }

    public static int[] solution(String[][] logs) {
        Map<String, Map<Integer, Integer>> inventory = new HashMap<>();
        List<SellTransaction> sellTransactions = new ArrayList<>();
        List<Integer> profits = new ArrayList<>();

        for (String[] log : logs) {
            String transactionType = log[0];
            String itemName = log[1];
            int count = Integer.parseInt(log[2]);

            if (!inventory.containsKey(itemName)) {
                inventory.put(itemName, new TreeMap<>());
            }

            if (transactionType.equals("supply")) {
                int price = Integer.parseInt(log[3]);
                inventory.get(itemName).merge(price, count, Integer::sum);
            } else if (transactionType.equals("sell")) {
                sellTransactions.add(new SellTransaction(itemName, count));
            } else if (transactionType.equals("return")) {
                int sellPrice = Integer.parseInt(log[3]);
                int newPrice = Integer.parseInt(log[4]);
                int returnedCount = count;
                int currentCount = inventory.get(itemName).getOrDefault(sellPrice, 0);
                inventory.get(itemName).merge(sellPrice, -returnedCount, Integer::sum);
                inventory.get(itemName).merge(newPrice, returnedCount, Integer::sum);
            }
        }

        for (SellTransaction sellTransaction : sellTransactions) {
            String itemName = sellTransaction.itemName;
            int count = sellTransaction.count;
            int revenue = 0;
            Map<Integer, Integer> priceMap = inventory.get(itemName);

            while (count > 0 && !priceMap.isEmpty()) {
                int lowestPrice = priceMap.keySet().iterator().next();
                int availableCount = priceMap.get(lowestPrice);
                int soldCount = Math.min(availableCount, count);
                revenue += soldCount * lowestPrice;
                priceMap.merge(lowestPrice, -soldCount, Integer::sum);
                if (priceMap.get(lowestPrice) == 0) {
                    priceMap.remove(lowestPrice);
                }
                count -= soldCount;
            }

            profits.add(revenue);
        }

        return profits.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        String[][] logs = {
                {"supply", "item1", "2", "100"},
                {"supply", "item2", "3", "60"},
                {"sell", "item1", "1"},
                {"sell", "item1", "1"},
                {"sell", "item2", "2"},
                {"return", "item2", "1", "60", "40"},
                {"sell", "item2", "1"},
                {"sell", "item2", "1"}
        };

        int[] profits = solution(logs);

        System.out.println("Profits for each sell transaction:");
        for (int profit : profits) {
            System.out.println(profit);
        }
    }
}
