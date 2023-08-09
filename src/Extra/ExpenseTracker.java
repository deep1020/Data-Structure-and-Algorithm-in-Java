package Extra;

import java.util.*;

class ExpenseCalculator {
    private Map<String, Double> expenses;
    private Map<String, Double> balances;
    private double overallBalance;

    public ExpenseCalculator() {
        expenses = new HashMap<>();
        balances = new HashMap<>();
        overallBalance = 0.0;
    }

    public void addExpense(String payer, List<String> participants, double amount) {
        double perPersonShare = amount / participants.size();

        for (String participant : participants) {
            if (!payer.equals(participant)) {
                balances.put(participant, balances.getOrDefault(participant, 0.0) + perPersonShare);
                overallBalance += perPersonShare;
            }
        }

        balances.put(payer, balances.getOrDefault(payer, 0.0) - amount);
        overallBalance -= amount;
        expenses.put(payer, expenses.getOrDefault(payer, 0.0) + amount);
    }

    public void printExpenses() {
        for (Map.Entry<String, Double> entry : balances.entrySet()) {
            String person = entry.getKey();
            double amount = entry.getValue();
            System.out.println(person + " owes: $" + amount);
        }
    }

    public double getOverallBalance() {
        return overallBalance;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseCalculator calculator = new ExpenseCalculator();

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the payer: ");
                    String payer = scanner.next();

                    System.out.print("Enter the number of participants: ");
                    int numParticipants = scanner.nextInt();

                    List<String> participants = new ArrayList<>();
                    for (int i = 0; i < numParticipants; i++) {
                        System.out.print("Enter the name of participant " + (i + 1) + ": ");
                        participants.add(scanner.next());
                    }

                    System.out.print("Enter the total amount paid: ");
                    double amountPaid = scanner.nextDouble();

                    calculator.addExpense(payer, participants, amountPaid);
                    break;

                case 2:
                    calculator.printExpenses();
                    System.out.println("Overall balance: $" + calculator.getOverallBalance());
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

            System.out.println();
        }
    }
}
