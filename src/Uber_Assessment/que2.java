package Uber_Assessment;

import java.util.ArrayList;
import java.util.List;

public class que2 {
    public static List<Integer> solution(int[] numbers) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        // Initial assignments based on the given rules
        first.add(numbers[0]);
        second.add(numbers[1]);

        // Process remaining numbers based on the given rules
        for (int i = 2; i < numbers.length; i++) {
            int num = numbers[i];
            int countFirst = countGreater(first, num);
            int countSecond = countGreater(second, num);

            if (countFirst > countSecond) {
                first.add(num);
            }
            else if (countFirst < countSecond) {
                second.add(num);
            }
            else {
                if (first.size() > second.size()) {
                    second.add(num);
                } else {
                    first.add(num);
                }
            }
        }

        // Combine the first and second arrays
        first.addAll(second);
        return first;
    }

    // Helper function to count the elements greater than a given number in a list
    private static int countGreater(List<Integer> list, int num) {
        int count = 0;
        for (int element : list) {
            if (element > num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {5,7,6,9,2};
        List<Integer> result = solution(numbers);
        System.out.println(result);
    }
}
