package game.data.shapes;

import game.util.PairInt;
import game.util.Shape;

public class ZShapeHorizontal extends Shape {
    {
        coordinates = new PairInt[]{
                new PairInt(-1,-1),
                new PairInt(0,-1),
                new PairInt(0,0),
                new PairInt(1,0)
        };
    }

    public ZShapeHorizontal(PairInt center) {
        super(center);
    }

    public ZShapeHorizontal() {
        super();
    }
}

