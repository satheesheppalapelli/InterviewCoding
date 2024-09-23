/*
Java code to find the account with the highest transaction value using Java Streams.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
AccountWithHighestTransaction Class:

We create transactions and assign them to accounts.
The accounts list holds all the accounts.
The main logic uses Java Streams to find the account that has the highest transaction.
It prints the account name and the highest transaction value for the account.
*/
public class AccountWithHighestTransaction {
    public static void main(String[] args) {
        // Sample transactions for two accounts
        Transaction t1 = new Transaction(1L, 1000.0); // Transaction with id 1 and value 1000.0
        Transaction t2 = new Transaction(2L, 2000.0); // Transaction with id 2 and value 2000.0
        Transaction t3 = new Transaction(3L, 3000.0); // Transaction with id 3 and value 3000.0
        Transaction t4 = new Transaction(4L, 4000.0); // Transaction with id 4 and value 4000.0
        Transaction t5 = new Transaction(5L, 2500.0); // Transaction with id 5 and value 2500.0
        Transaction t6 = new Transaction(6L, 5000.0); // Transaction with id 6 and value 5000.0
        
        // Sample Accounts with Transactions
        Account account1 = new Account(1L, "Account 1", Arrays.asList(t1, t2)); // Account 1 with two transactions
        Account account2 = new Account(2L, "Account 2", Arrays.asList(t3, t4)); // Account 2 with two transactions
        Account account3 = new Account(3L, "Account 3", Arrays.asList(t5, t6)); // Account 3 with two transactions

        // List of accounts
        List<Account> accounts = Arrays.asList(account1, account2, account3); // A list of all accounts

        // Finding the account with the highest transaction using Java Streams
        Optional<Account> accountWithHighestTransaction = accounts.stream() // Convert list of accounts to stream
            .max(Comparator.comparingDouble(account -> account.getTransactions().stream() // Compare accounts by highest transaction value
                .mapToDouble(Transaction::getTransactionValue) // Map transactions to their transaction values
                .max().orElse(0.0)));  // Find the max transaction value in the account's transactions, default to 0.0 if no transactions

        // If an account is found, print the account details and the highest transaction
        accountWithHighestTransaction.ifPresent(account -> { // Check if an account was found
            // Get the highest transaction for this account
            Optional<Double> highestTransaction = account.getTransactions().stream() // Stream the transactions of the found account
                .map(Transaction::getTransactionValue) // Map transactions to their values
                .max(Double::compare); // Find the maximum value

            // Print account name
            System.out.println("Account with the highest transaction: " + account.getAccountName()); 
            
            // Print the highest transaction value, if it exists
            highestTransaction.ifPresent(value -> System.out.println("Highest transaction value: " + value));
        });
    }

}

/*
Account Class:

This class has fields for id, accountName, and a list of transactions. 
It also has a constructor, getters, setters, and toString() for printing account details.
*/

class Account {
    private Long id; // Account ID
    private String accountName; // Account name
    private List<Transaction> transactions; // List of transactions associated with this account

    // Constructor
    public Account(Long id, String accountName, List<Transaction> transactions) {
        this.id = id;
        this.accountName = accountName;
        this.transactions = transactions;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    // Override toString() for printing the account object
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}

/*
Transaction Class:

This class contains fields for id and transactionValue with a constructor, getters, setters, and toString().
*/

class Transaction {
    private Long id; // Transaction ID
    private Double transactionValue; // Value of the transaction

    // Constructor
    public Transaction(Long id, Double transactionValue) {
        this.id = id;
        this.transactionValue = transactionValue;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(Double transactionValue) {
        this.transactionValue = transactionValue;
    }

    // Override toString() for printing the transaction object
    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionValue=" + transactionValue +
                '}';
    }
}
