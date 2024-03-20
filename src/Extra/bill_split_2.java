package Extra;

import java.util.*;

public class bill_split_2 {
    private static Map<String, Double> expenses = new HashMap<>();
    private static List<String> persons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("1. Add an expense");
            System.out.println("2. Calculate expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addExpense(scanner);
                    break;
                case "2":
                    calculateExpenses();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (!choice.equals("3"));
    }

    private static void addExpense(Scanner scanner) {
        System.out.print("Enter the name of the payer: ");
        String payer = scanner.nextLine();

        System.out.print("Enter the total bill amount: $");
        double billAmount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the number of persons to split the bill: ");
        int numOfPersons = Integer.parseInt(scanner.nextLine());

        double perPersonAmount = billAmount / numOfPersons;

        for (int i = 1; i <= numOfPersons; i++) {
            System.out.print("Enter the name of person " + i + ": ");
            String person = scanner.nextLine();
            if (!persons.contains(person)) {
                persons.add(person);
                expenses.put(person, 0.0);
            }
            expenses.put(person, expenses.get(person) + perPersonAmount);
        }

        System.out.println("Expense added successfully!\n");
    }

    private static void calculateExpenses() {
        System.out.println("Expense calculation:");
        for (String person : persons) {
            System.out.println(person + " owes $" + expenses.get(person));
        }
        System.out.println();
    }
}

