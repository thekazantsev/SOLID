package lsp.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void perimeter() {
        Rectangle rectangle = initRectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(7);

        int result = rectangle.perimeter();

        assertEquals(24, result);
    }

    protected Rectangle initRectangle() {
        return new Rectangle();
    }
}
