package adventofcode.sonarsweep;

public record DepthDifference(Integer current, Integer previous) {

    public boolean isIncrement() {
        return current > previous;
    }
}
