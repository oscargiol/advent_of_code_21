package adventofcode.dive;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivingControlShould {
    private DivingControl divingControl = new DivingControl();

    @Test
    void move_submarine_given_a_planned_course() {
        List<Movement> movements = List.of(
                new Movement(Direction.FORWARD, 5),
                new Movement(Direction.DOWN, 5),
                new Movement(Direction.FORWARD, 8),
                new Movement(Direction.UP, 3),
                new Movement(Direction.DOWN, 8),
                new Movement(Direction.FORWARD, 2)
        );
    }
}