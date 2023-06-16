package HashMap;
import java.util.*;

public class count_frequency_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt for input sentences
        System.out.print("Enter sentences (separated by '.'): ");
        String input = scanner.nextLine();
        // Prompt for input word
        System.out.print("Enter word: ");
        String word = scanner.next();

        // Create a HashMap to store the word count for each sentence
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input sentences by '.' to separate individual sentences
        String[] sentences = input.split("\\.");

        // Iterate over each sentence
        for (String sentence : sentences) {
            // Split the sentence into words
            String[] words = sentence.trim().split("\\s+");

            // Count the occurrence of the input word in the current sentence
            int count = 0;
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) {
                    count++;
                }
            }

            // Store the word count in the HashMap
            wordCountMap.put(sentence.trim(), count);
        }

        // Display the word count for each sentence
        System.out.println("Word count for each sentence:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String sentence = entry.getKey();
            int count = entry.getValue();
            System.out.println("Sentence: " + sentence);
            System.out.println("Count of word '" + word + "': " + count);
            System.out.println();
        }
    }
}

