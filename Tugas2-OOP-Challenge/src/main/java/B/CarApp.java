package B;

import java.util.Scanner;

// Create object to see the class output
public class CarApp {
    public static void main(String[] args){
        // Create objects from all the Car type
        HondaJazz jazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();
        SuzukiKatana katana = new SuzukiKatana();

        // Declare the attribute for each subclass
        // Attributes from Vehicle parent class
        jazz.setType("Jazz");
        jazz.setColor("Red");
        jazz.setReleasedYear(2019);
        jazz.setPrice(350000000);

        fortuner.setType("Fortuner");
        fortuner.setColor("Pink");
        fortuner.setReleasedYear(2023);
        fortuner.setPrice(899000000);

        katana.setType("Katana");
        katana.setColor("Tosca");
        katana.setReleasedYear(2023);
        katana.setPrice(125000000);

        // Attributes from Car subclass
        jazz.setTransmission("super");
        jazz.setTankCapacity(40);
        fortuner.setTransmission("soft");
        fortuner.setTankCapacity(50);
        katana.setTransmission("medium");
        katana.setTankCapacity(80);

        // Attributes from each subclass of Car
        jazz.setJazzType("Hello Kitty 24.v.01");
        fortuner.setFortunerEngine("Barbie x Ken Extra Turbo");
        katana.setWheelType("4x4 Off Road Anti-Slipper");

        // Call the method depends on the customer's desired car type
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SYNRGY Car Store! What kind of car are you looking for (jazz/fortuner/katana)? 🚨");
        String carType = scanner.nextLine();
        scanner.close();
        switch (carType) {
            case "jazz" -> {
                jazz.vehicleSpeciality();
                jazz.vehicleIdentity();
                jazz.vehiclePrice();
            }
            case "fortuner" -> {
                fortuner.vehicleSpeciality();
                fortuner.vehicleIdentity();
                fortuner.vehiclePrice();
            }
            case "katana" -> {
                katana.vehicleSpeciality();
                katana.vehicleIdentity();
                katana.vehiclePrice();
            }
            default -> System.out.println("Sorry your input is invalid!");
        }
    }
}
