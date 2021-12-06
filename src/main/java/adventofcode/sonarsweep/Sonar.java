package adventofcode.sonarsweep;

import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Math.toIntExact;

public class Sonar {
    public Integer depthIncrementFor(List<Integer> measurements) {
        return toIntExact(
                IntStream.range(1, measurements.size())
                .mapToObj(current -> new DepthDifference(measurements.get(current), measurements.get(current - 1)))
                .filter(DepthDifference::isIncrement)
                .count()
        );
    }

    public Integer depthIncrementForGrouped(List<Integer> measurements) {
        List<Integer> groupedMeasurements = IntStream.range(2, measurements.size())
                .mapToObj(current -> measurements.get(current) + measurements.get(current - 1) + measurements.get(current - 2))
                .toList();
        return depthIncrementFor(groupedMeasurements);
    }
}
