package adventofcode.dive;

public record Position(Integer horizontal, Integer depth, Integer aim) {
    public static Position start(){
        return new Position(0, 0, 0);
    }

    public Position modifyWith(Movement movement) {
        return switch (movement.direction()) {
            case DOWN -> new Position(horizontal, depth + movement.units(), aim);
            case UP -> new Position(horizontal, depth - movement.units(), aim);
            case FORWARD -> new Position(horizontal + movement.units(), depth, aim);
        };
    }

    public Position modifyWithAimed(Movement movement) {
        return switch (movement.direction()) {
            case DOWN -> new Position(horizontal, depth, aim + movement.units());
            case UP -> new Position(horizontal, depth, aim - movement.units());
            case FORWARD -> new Position(horizontal + movement.units(), depth + (aim * movement.units()), aim);
        };
    }
}
