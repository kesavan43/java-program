public class ATM {
    private double balance;
    private Scanner scanner;

    public ATM() {
        this.balance = 0.0;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", balance);
    }

    private void depositMoney() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("$%.2f has been deposited. Your new balance is: $%.2f\n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    private void withdrawMoney() {
                System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("$%.2f has been withdrawn. Your new balance is: $%.2f\n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Please try a smaller amount.");
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}





