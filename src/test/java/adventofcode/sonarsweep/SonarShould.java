package adventofcode.sonarsweep;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SonarShould {
    private Sonar sonar = new Sonar();

    @Test
    void count_the_number_of_times_a_depth_measurement_increases() {
        List<Integer> measurements = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);

        int depthIncrement = sonar.depthIncrementFor(measurements);

        assertThat(depthIncrement).isEqualTo(7);
    }

    @Test
    void count_the_number_of_times_a_grouped_depth_measurement_increases() {
        List<Integer> measurements = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);

        int depthIncrement = sonar.depthIncrementForGrouped(measurements);

        assertThat(depthIncrement).isEqualTo(5);
    }
}