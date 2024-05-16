package ParkingCalculateApp;
import java.util.Scanner;

public class calculate {

    public static void main(String[] args){

        // Create variable to store the parking duration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SYNRGY Parking Lot 🅿️!");
        System.out.println("How many hours you've been using our facility Ma'am? ");
        int duration = scanner.nextInt();
        scanner.close();

        // Else if method to calculate the parking charge based on the charges duration rules
        double charge;
        if (duration <= 5){
            charge = 1;
        } else if (duration < 24 ) {
            charge = 1 + ((duration-5)*0.5);
        } else {
            charge = 15 + ((duration-24)*0.5);
        }

        // Tell customer the total parking charge
        System.out.println("Great! Your parking charge will be cost $" + charge + " 🪙");

    }
}
