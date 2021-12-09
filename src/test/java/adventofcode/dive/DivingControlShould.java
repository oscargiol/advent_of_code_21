package adventofcode.dive;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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

        Position finalPosition = divingControl.perform(movements);

        assertThat(finalPosition).isEqualTo(new Position(15, 10, 0));
    }

    @Test
    void move_submarine_given_a_planned_course_with_aim() {
        List<Movement> movements = List.of(
                new Movement(Direction.FORWARD, 5),
                new Movement(Direction.DOWN, 5),
                new Movement(Direction.FORWARD, 8),
                new Movement(Direction.UP, 3),
                new Movement(Direction.DOWN, 8),
                new Movement(Direction.FORWARD, 2)
        );

        Position finalPosition = divingControl.performWithAim(movements);

        assertThat(finalPosition).isEqualTo(new Position(15, 60, 10));
    }
}