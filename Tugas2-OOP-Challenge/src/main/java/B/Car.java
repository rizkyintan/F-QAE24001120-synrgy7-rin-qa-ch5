package B;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// Implement Inheritance: Create subclass which inherit Vehicle (parents) class
public class Car extends Vehicle{

    // Create different attribute which only exist in Car
    private int wheel = 4;
    private int tankCapacity;
    private String transmission;

    // Implement Polymorphism: Create different implementation of method from the parent class Vehicle
    public void vehicleIdentity(){
        System.out.println("With new "+ getTransmission() + " transmission type and " + getTankCapacity() + " liter tank capacity," +
                "this Car will bring you into incredible journey! 🚗⚡");
    }

}
