package game.data.figures;

import game.data.Block;
import game.data.Figure;
import game.data.blocks.TempBlock;
import game.data.shapes.TShape0Degree;
import game.data.shapes.TShape180Degree;
import game.data.shapes.TShape270Degree;
import game.data.shapes.TShape90Degree;
import game.util.PairInt;
import game.util.Shape;

public class TFigure extends Figure {
    protected TFigure(PairInt center, Shape[] rotateArray, Block[] blocks) {
        super(center, rotateArray, blocks);
    }

    public TFigure(PairInt center) {
        this(center,
                new Shape[]{
                        new TShape0Degree(),
                        new TShape90Degree(),
                        new TShape180Degree(),
                        new TShape270Degree(),
                },
                new Block[]{
                        new TempBlock(0, 0),
                        new TempBlock(0, 0),
                        new TempBlock(0, 0),
                        new TempBlock(0, 0)
                });

    }
}