package B;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToyotaFortuner extends Car {

    // Create attribute which can only exist in Honda Jazz subclass
    private String fortunerEngine;

    // Create method which can only exist in Toyota Fortuner subclass
    public void vehicleSpeciality(){
        System.out.println("Let's grab this horse power Fortuner "+ getFortunerEngine() + " brand new engine!");
    }
}
