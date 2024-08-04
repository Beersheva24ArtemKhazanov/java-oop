package telran.shapes;

public class Canvas implements Shape {
    public Shape[] shapes;
    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
        shapes = telran.util.Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimeter() {
        int sumPerimeters = 0;
        for (Shape shape: shapes) {
            sumPerimeters += shape.perimeter();
        }
        return sumPerimeters;
    }

    @Override
    public int square() {
        int sumSquares = 0;
        for (Shape shape: shapes) {
            sumSquares += shape.square();
        }
        return sumSquares;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public int count() {
        int res = 0;
        for (Shape shape : shapes) {
            res++;
            if (shape instanceof Canvas) {
                Canvas innerShapes = (Canvas)shape;
                res += innerShapes.count();
            }
        }
        return res;
    }

}
