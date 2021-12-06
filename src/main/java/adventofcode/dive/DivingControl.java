package adventofcode.dive;

import java.util.List;

import static adventofcode.dive.Position.*;

public class DivingControl {

    public Position perform(List<Movement> movements) {
        Position position = start();
        for(Movement movement : movements){
            position = position.modifyWith(movement);
        }
        return position;
    }

    public Position performWithAim(List<Movement> movements) {
        Position position = start();
        for(Movement movement : movements){
            position = position.modifyWithAimed(movement);
        }
        return position;
    }
}
