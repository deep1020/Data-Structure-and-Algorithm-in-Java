import java.util.*;

public class bill_split_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        scanner.nextLine();

        List<String> persons = new ArrayList<>();
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter the name of person " + (i + 1) + ": ");
            persons.add(scanner.nextLine());
        }

        System.out.print("Enter the name of the person who paid the bill: ");
        String payer = scanner.nextLine();

        System.out.print("Enter the total bill amount: $");
        double totalBill = scanner.nextDouble();

        System.out.print("Enter the number of persons to divide the bill among: ");
        int numSelectedPersons = scanner.nextInt();
        scanner.nextLine();

        List<String> selectedPersons = new ArrayList<>();
        for (int i = 0; i < numSelectedPersons; i++) {
            System.out.print("Enter the name of selected person " + (i + 1) + ": ");
            selectedPersons.add(scanner.nextLine());
        }

        double perPersonAmount = totalBill / numSelectedPersons;
        double payerAmount = totalBill - perPersonAmount;

        System.out.println("Expenses:");

        for (String person : selectedPersons) {
            if (!person.equals(payer)) {
                System.out.println(person + " owes $" + perPersonAmount + " to " + payer);
            }
        }

        System.out.println(payer + " paid $" + totalBill);
        System.out.println(payer + " owes $" + payerAmount + " to other selected persons.");
    }
}
