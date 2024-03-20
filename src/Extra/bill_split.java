package Extra;

import java.util.*;

public class bill_split {
    private static Map<String, Double> balances = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Expense Calculator");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add expense");
            System.out.println("2. Calculate individual expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addExpense(scanner);
                    break;
                case 2:
                    calculateExpenses();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addExpense(Scanner scanner) {
        System.out.print("Enter the payer's name: ");
        String payer = scanner.next();

        System.out.print("Enter the total amount paid: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Enter the number of persons sharing the expense: ");
        int numPersons = scanner.nextInt();

        if (numPersons <= 0) {
            System.out.println("Invalid number of persons.");
            return;
        }

        List<String> persons = new ArrayList<>();
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter the name of person " + (i + 1) + ": ");
            String person = scanner.next();
            persons.add(person);
        }

        double individualAmount = totalAmount / numPersons;

        for (String person : persons) {
            if (!person.equals(payer)) {
                balances.put(person, balances.getOrDefault(person, 0.0) + individualAmount);
            }
        }

        System.out.println("Expense added successfully.");
    }

    private static void calculateExpenses() {
        System.out.println("\nIndividual Expenses:");

        for (Map.Entry<String, Double> entry : balances.entrySet()) {
            String person = entry.getKey();
            double amountOwed = entry.getValue();
            System.out.println(person + " owes $" + amountOwed);
        }
    }
}
