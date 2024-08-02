package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShapesTest {
    @Test
    void rectanglePerimeterAndSquareTests() {
        Rectangle rectangle = new Rectangle(32, 24);
        int expectedPerimeter = 112;
        int expectedSquare = 768;
        assertEquals(expectedPerimeter, rectangle.perimeter());
        assertEquals(expectedSquare, rectangle.square());
    }

    @Test
    void squarePerimeterAndSquareTests() {
        Square square = new Square(32);
        int expectedPerimeter = 128;
        int expectedSquare = 1024;
        assertEquals(expectedPerimeter, square.perimeter());
        assertEquals(expectedSquare, square.square());
    }

    @Test
    void addShapeTest() {
        Canvas canvas = new Canvas();
        Rectangle rectangle1 = new Rectangle(54, 12);
        Rectangle rectangle2 = new Rectangle(13, 5);
        Square square1 = new Square(23);
        Square square2 = new Square(54);
        canvas.addShape(rectangle1);
        canvas.addShape(rectangle2);
        canvas.addShape(square1);
        canvas.addShape(square2);
        Shape[] shapes = {rectangle1, rectangle2, square1, square2};
        Shape[] expectedShapes = canvas.getShapes();
        assertArrayEquals(expectedShapes, shapes);
    }

    @Test
    void canvasPerimeterAndSquareTest() {
        Canvas canvas = new Canvas();
        Rectangle rectangle1 = new Rectangle(54, 12);
        Rectangle rectangle2 = new Rectangle(13, 5);
        Square square1 = new Square(23);
        Square square2 = new Square(54);
        Square square3 = new Square(24);
        canvas.addShape(rectangle1);
        canvas.addShape(rectangle2);
        canvas.addShape(square1);
        canvas.addShape(square2);
        canvas.addShape(square3);
        int expectedPerimeter = 572;
        int expectedSquare = 4734;
        assertEquals(expectedPerimeter, canvas.perimeter());
        assertEquals(expectedSquare, canvas.square());
    }

}
