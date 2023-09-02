package lsp.rectangle;

public class SquareTest extends RectangleTest {
    @Override
    protected Rectangle initRectangle() {
        return new Square();
    }
}
