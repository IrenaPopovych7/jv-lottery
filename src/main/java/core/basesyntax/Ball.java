package core.basesyntax;

public class Ball {

    private final Colors color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public Colors getColor(Colors color) {
        return color;
    }

    public int getNumber(int number) {
        return number;
    }

    @Override
    public String toString() {
        return color + " " + number;
    }
}
