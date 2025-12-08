package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_NUMBER = 100;
    private final Random rundom = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Colors color = colorSupplier.getRandomColor();
        int number = rundom.nextInt(MAX_NUMBER + 1);

        return new Ball(color, number);
    }
}
