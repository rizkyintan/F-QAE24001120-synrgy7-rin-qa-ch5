package B;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// Create class vehicle
public class Vehicle {

    // Create vehicle attribute that represents vehicle's characteristics
    private String type;
    private String color;
    private int releasedYear;
    private int price;

    // Create constructor with no parameter
    Vehicle(){}

    // Create 3 different methods of vehicle
    public void vehicleIdentity(){
        System.out.println("This is great " + this.type + " with mesmerizing " + this.color + " color 💨🔥🔥");
    }
    public void vehiclePrice(){
        System.out.println("Released in "+ this.releasedYear + " on sale only for " + this.price);
    }
    public void vehicleSpeciality(){

    }
}
