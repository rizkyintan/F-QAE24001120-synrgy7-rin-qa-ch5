package A;

import lombok.Getter;
import lombok.Setter;

// Declare getter and setter for all attributes
@Getter
@Setter

// Create class named BankAccount
public class BankAccount {

    // Implement Encapsulation: all fields or attributes access modifier turned into private
    // Create attribute
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Create constructor with no parameter
    BankAccount(){}

    // Create constructor with parameter
    BankAccount(int accountNumber,
                double balance,
                String customerName,
                String customerEmail,
                String customerPhone){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // Create methods
    // Deposit method will increase customer's balance
    public double deposit(double amount){
        double balance = getBalance() + amount;
        return balance;
    }

    // Withdraw method will decrease customer's balance
    public double withdraw(double amount){
        double balance = getBalance() + (-amount);
        return balance;
    }
}
