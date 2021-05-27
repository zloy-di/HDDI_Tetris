package game.data.shapes;

import game.util.PairInt;
import game.util.Shape;

public class LShape180Degree extends Shape {
    {
        coordinates = new PairInt[]{
                new PairInt(-1, -1),
                new PairInt(0, -1),
                new PairInt(0, 0),
                new PairInt(0, 1)
        };
    }

    public LShape180Degree(PairInt center) {
        super(center);
    }

    public LShape180Degree() {
        super();
    }
}