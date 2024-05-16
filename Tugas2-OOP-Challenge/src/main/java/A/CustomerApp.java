package A;

import java.util.Scanner;

// Create object of bank account class which is the Customer
public class CustomerApp {

    public static void main(String[] args) {

        // Create new object customer
        BankAccount customer = new BankAccount();
        customer.setAccountNumber(1);
        customer.setBalance(1000000);
        customer.setCustomerName("Intan Nurlita");
        customer.setCustomerEmail("rizkyintannurlita@gmail.com");
        customer.setCustomerPhone("08123456789");

        // Call the function to do the banking action
        bankingAction(customer);
    }

    public static void bankingAction(BankAccount customer){
        // Create method to ask the user the method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SYNRGY Banking App " + customer.getCustomerName() + "! 💸✨");
        System.out.println("Your balance now is: " + customer.getBalance());
        System.out.println("Choose your desired method (deposit/withdraw): ");
        String method = scanner.nextLine();

        if (method.equals("deposit") | method.equals("withdraw")){
            // Ask the amount of money
            System.out.println("How much do you want to " + method + "?");
            double amount = scanner.nextInt();

            //  Else if to decide the action depends on the method chosen
            double balance;
            if ( method.equals("deposit")){
                balance = customer.deposit(amount);
                customer.setBalance(balance);
                System.out.println("Thanks for the " + method + " your balance now is: " + balance);
            } else {
                if ( amount > customer.getBalance()){
                    System.out.println("Your balance is not enough 🥲! Go work and earn more money!");
                }
                else{
                    balance = customer.withdraw(amount);
                    customer.setBalance(balance);
                    System.out.println("Thanks for the " + method + " your balance now is: " + balance);
                }
            }
        }else{
            System.out.println("Invalid method chosen.");
        }

        // Else if to ask the user if they want to continue banking action
        System.out.println("Do you still wanna continue banking (yes/no): ");
        String isAgain = scanner.next();

        if (isAgain.equals("yes")){
            bankingAction(customer);
        }else if (isAgain.equals("no")){
            System.out.println("Thank you for using SYNRGY Banking App! Have a nice day " + customer.getCustomerName() + "! 🥰");
        }else{
            System.out.println("Invalid method chosen.");
            System.out.println("Thank you for using SYNRGY Banking App! Have a nice day " + customer.getCustomerName() + "! 🥰");
        }
        scanner.close();
    }
}
