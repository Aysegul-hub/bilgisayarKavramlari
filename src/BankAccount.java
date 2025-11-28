
import java.util.Random;
    public class BankAccount {

        // 1. Private final instance fields (immutable once set)
        private int accountNumber;
        private String ownerName;
        private double balance;

        // 2. Private static fields for global tracking and constraints (constants)

        /** Counts how many BankAccount objects have been created. */
        private static int totalAccounts = 0;

        /** Minimum allowed balance for the account (e.g., 0.0). */
        private static final double MIN_BALANCE = 0.0;

        /** Maximum amount allowed per single withdrawal transaction (e.g., 2000.0). */
        private static final double MAX_WITHDRAW_LIMIT = 2000.0;

        // Static initializer block (optional, but ensures totalAccounts is tracked correctly)
        {
            totalAccounts++;
        }

        public BankAccount(String ownerName, double initialBalance) {
            // Generate a random 9-digit account number (100,000,000 to 999,999,999)
            // Using Random for secure, random number generation is good practice.
            Random random = new Random();
            this.accountNumber = random.nextInt(900000000) + 100000000;

            this.ownerName = ownerName;
            this.balance = initialBalance;
        }

        // --- Accessors (Getters and Setters) ---

        public int getAccountNumber() {
            return this.accountNumber; // Read-only, no setter required
        }

        public String getOwnerName() {
            return this.ownerName;
        }

        public void setOwnerName(String newOwnerName) {
            if (newOwnerName != null && !newOwnerName.trim().isEmpty()) {
                this.ownerName = newOwnerName;
            } else {
                System.err.println("Error: Owner name cannot be empty.");
            }
        }

        public double getBalance() {
            return this.balance;
        }

        public static double getMIN_BALANCE() {
            return MIN_BALANCE;
        }

        public static double getMAX_WITHDRAW_LIMIT() {
            return MAX_WITHDRAW_LIMIT;
        }

        // --- Business Methods ---

        public boolean deposit(double amount) {
            if (amount <= 0) {
                System.err.println("Deposit Error: Amount must be positive.");
                return false;
            }
            this.balance += amount;
            return true;
        }

        public boolean withdraw(double amount) {
            // 1. Check for valid withdrawal amount
            if (amount <= 0) {
                System.err.println("Withdrawal Error: Amount must be positive.");
                return false;
            }

            // 2. Check the MAX_WITHDRAW_LIMIT
            if (amount > MAX_WITHDRAW_LIMIT) {
                System.err.printf("Withdrawal Error: Amount %.2f exceeds the maximum limit of %.2f.\n",
                        amount, MAX_WITHDRAW_LIMIT);
                return false;
            }

            // Calculate the balance after withdrawal
            double newBalance = this.balance - amount;

            // 3. Check for sufficient funds (must stay above or equal to MIN_BALANCE)
            if (newBalance < MIN_BALANCE) {
                System.err.printf("Withdrawal Error: Insufficient funds. Withdrawal of %.2f would drop balance below the minimum of %.2f. Current balance: %.2f\n",
                        amount, MIN_BALANCE, this.balance);
                return false;
            }

            // If all checks pass, perform the withdrawal
            this.balance = newBalance;
            return true;
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }

        public String getInfo() {
            return String.format(
                    "Account Details:\n" +
                            "  Owner Name: %s\n" +
                            "  Account Number: %d\n" +
                            "  Current Balance: $%.2f\n" +
                            "  Total Accounts Created: %d\n" +
                            "  Min Allowed Balance: $%.2f\n" +
                            "  Max Single Withdrawal: $%.2f",
                    this.ownerName,
                    this.accountNumber,
                    this.balance,
                    totalAccounts,
                    MIN_BALANCE,
                    MAX_WITHDRAW_LIMIT
            );
        }

        // --- Main method for demonstration ---
        public static void main(String[] args) {
            System.out.println("--- Creating Bank Accounts ---");
            BankAccount account1 = new BankAccount("Alice Smith", 5000.0);
            BankAccount account2 = new BankAccount("Bob Johnson", 100.0);

            System.out.println("\n--- Account 1 Info ---");
            System.out.println(account1.getInfo());

            System.out.println("\n--- Account 2 Info ---");
            System.out.println(account2.getInfo());

            System.out.println("\n--- Testing Transactions for Account 1 (Alice) ---");

            // Successful deposit
            System.out.println("\nAttempting deposit of $100.00...");
            account1.deposit(100.0);
            System.out.printf("New Balance: $%.2f\n", account1.getBalance());

            // Successful withdrawal
            System.out.println("\nAttempting withdrawal of $500.00...");
            if (account1.withdraw(500.0)) {
                System.out.printf("Withdrawal successful. New Balance: $%.2f\n", account1.getBalance());
            }

            // Withdrawal exceeding max limit (Failure)
            System.out.println("\nAttempting withdrawal of $2500.00 (Max is 2000.0)...");
            if (!account1.withdraw(2500.0)) {
                System.out.println("Withdrawal failed as expected due to limit.");
            }

            // Withdrawal that would violate MIN_BALANCE (Failure)
            // Current balance is 5100 - 500 = 4600.
            // Try to withdraw $4600.01 (min balance is 0.0)
            System.out.println("\nAttempting withdrawal of $4600.01 (to test MIN_BALANCE)...");
            if (!account1.withdraw(4600.01)) {
                System.out.println("Withdrawal failed as expected due to insufficient funds.");
            }

            // Final check on total accounts
            System.out.println("\n--- Final Account Count ---");
            System.out.println("Total Bank Accounts created: " + BankAccount.getTotalAccounts());
        }
    }

