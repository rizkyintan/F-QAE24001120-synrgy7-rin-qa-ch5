package B;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuzukiKatana extends Car{

    // Create attribute which can only exist in Honda Jazz subclass
    private String wheelType;

    // Create method which can only exist in Suzuki Katana subclass
    public void vehicleSpeciality(){
        System.out.println("Let's go grab this extra powerful Katana "+ getWheelType() + "!");
    }
}
