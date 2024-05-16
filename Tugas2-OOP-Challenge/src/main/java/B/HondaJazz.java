package B;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HondaJazz extends Car{

    // Create attribute which can only exist in Honda Jazz subclass
    private String jazzType;

    // Create method which can only exist in Honda Jazz subclass
    public void vehicleSpeciality(){
        System.out.println("Let's grab this all new Jazz "+ getJazzType() + " fast!");
    }
}
