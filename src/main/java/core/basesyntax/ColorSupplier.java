package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Random RANDOM = new Random();

    public Colors getRandomColor() {
        Colors[] values = Colors.values();
        return values[RANDOM.nextInt(values.length)];
    }
}
