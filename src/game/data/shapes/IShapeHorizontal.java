package game.data.shapes;

import game.util.PairInt;
import game.util.Shape;

public class IShapeHorizontal extends Shape {
    {
        coordinates = new PairInt[]{
                new PairInt(-1,0),
                new PairInt(0,0),
                new PairInt(1,0),
                new PairInt(2,0)
        };
    }

    public IShapeHorizontal(PairInt center) {
        super(center);
    }

    public IShapeHorizontal() {
        super();
    }
}