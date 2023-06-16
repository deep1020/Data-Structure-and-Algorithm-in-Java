import java.util.*;

public class Bank_Account_Program {
    Scanner scan = new Scanner(System.in);
    int id;
    String name;
    float bal;
    void get(Set<Integer> usedIds) {
        try {
            System.out.println("Input Account Id");
            id = scan.nextInt();
            if (id > 10000) {
                throw new Exception();
            }
            if (usedIds.contains(id)) {
                throw new Exception("ID already exist. Please enter another ID");
            }
            usedIds.add(id);

            System.out.println("Input Account Name");
            name = scan.next();
            System.out.println("Input Account Balance");
            bal = scan.nextFloat();
        }
        catch (InputMismatchException ex) {
            System.out.println("Input not valid");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    void set() {
        System.out.println("Id :" + id);
        System.out.println("Name :" + name);
        System.out.println("Balance :" + bal);
    }
    float getBalance() {
        return bal;
    }
    void withdraw(float amount) {
        bal -= amount;
    }
    void deposit(float amount) {
        bal += amount;
    }
}
class BankMain {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Bank_Account_Program> list = new LinkedList<>();
        Set<Integer> usedIds = new HashSet<>();

        while (true) {
            System.out.println("1 for get");
            System.out.println("2 for set");
            System.out.println("3 for withdraw");
            System.out.println("4 for deposit");
            System.out.println("5 for exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: {
                    String str="Y";
                    while (str.equalsIgnoreCase("y")) {
                        Bank_Account_Program account = new Bank_Account_Program();
                        account.get(usedIds);
                        list.add(account);
                        System.out.println("Do u want to add more[Y/N]?");
                        str = scan.next();
                    }
                    break;
                }
                case 2: {
                    for (Bank_Account_Program account : list) {
                        account.set();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Input Account Id for withdraw");
                    int id = scan.nextInt();
                    boolean found = false;
                    for (Bank_Account_Program account : list) {
                        if (account.id == id) {
                            System.out.println("Input amount for withdraw");
                            float amount = scan.nextFloat();
                            account.withdraw(amount);
                            System.out.println("Final amount:" + account.getBalance());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Id");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Input Account Id for deposit");
                    int id = scan.nextInt();
                    boolean found = false;
                    for (Bank_Account_Program account : list) {
                        if (account.id == id) {
                            System.out.println("Input amount for deposit");
                            float amount = scan.nextFloat();
                            account.deposit(amount);
                            System.out.println("Final amount:" + account.getBalance());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Id");
                    }
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
