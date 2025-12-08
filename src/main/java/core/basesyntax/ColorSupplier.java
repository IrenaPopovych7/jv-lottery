package core.basesyntax;

import java.util.Random;

import static core.basesyntax.Colors.*;

public class ColorSupplier {

    private static final Random RANDOM = new Random();

    public Colors getRandomColor() {
        Colors[] values = values();
        return values[RANDOM.nextInt(values.length)];
    }
}
