//package Extra;
//
//import java.util.*;
//
//class ExpenseCalculator {
//    private Map<String, Double> expenses;
//    private Map<String, Double> balance;
//
//    public ExpenseCalculator(List<String> persons) {
//        expenses = new HashMap<>();
//        balance = new HashMap<>();
//
//        for (String person : persons) {
//            expenses.put(person, 0.0);
//            balance.put(person, 0.0);
//        }
//    }
//
//    public void addExpense(String payer, List<String> beneficiaries, double amount) {
//        double perPersonShare = amount / beneficiaries.size();
//
//        // Update expenses
//        for (String beneficiary : beneficiaries) {
//            double existingExpense = expenses.get(beneficiary);
//            expenses.put(beneficiary, existingExpense + perPersonShare);
//        }
//
//        // Update balance
//        double existingBalance = balance.get(payer);
//        balance.put(payer, existingBalance + amount);
//
//        for (String beneficiary : beneficiaries) {
//            double existingBalanceBene = balance.get(beneficiary);
//            balance.put(beneficiary, existingBalanceBene - perPersonShare);
//        }
//    }
//
//    public void printExpenses() {
//        System.out.println("Total expenses:");
//        for (Map.Entry<String, Double> entry : expenses.entrySet()) {
//            System.out.println(entry.getKey() + ": $" + entry.getValue());
//        }
//        System.out.println();
//
//        System.out.println("Individual balances:");
//        for (Map.Entry<String, Double> entry : balance.entrySet()) {
//            System.out.println(entry.getKey() + ": $" + entry.getValue());
//        }
//        System.out.println();
//    }
//}
//
//public class bill_split_4 {
//    public static void main(String[] args) {
//        List<String> persons = new ArrayList<>();
//        ExpenseCalculator calculator = new ExpenseCalculator(persons);
//        Scanner scanner = new Scanner(System.in);
//
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("Select an option:");
//            System.out.println("1. Add an expense");
//            System.out.println("2. Print expenses");
//            System.out.println("3. Exit");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the name of the payer: ");
//                    String payer = scanner.nextLine();
//
//                    System.out.print("Enter the number of beneficiaries: ");
//                    int beneficiaryCount = scanner.nextInt();
//                    scanner.nextLine(); // Consume newline
//
//                    List<String> beneficiaries = new ArrayList<>();
//                    for (int i = 0; i < beneficiaryCount; i++) {
//                        System.out.print("Enter the name of beneficiary " + (i + 1) + ": ");
//                        beneficiaries.add(scanner.nextLine());
//                    }
//
//                    System.out.print("Enter the amount: $");
//                    double amount = scanner.nextDouble();
//                    scanner.nextLine(); // Consume newline
//
//                    calculator.addExpense(payer, beneficiaries, amount);
//                    break;
//
//                case 2:
//                    calculator.printExpenses();
//                    break;
//
//                case 3:
//                    exit = true;
//                    break;
//
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//}
