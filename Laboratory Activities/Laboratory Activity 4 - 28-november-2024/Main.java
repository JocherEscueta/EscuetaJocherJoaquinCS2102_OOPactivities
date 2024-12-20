public class Main {
    public static void main(String[] args) {
        Square square = new Square(20);
        Rectangle rectangle = new Rectangle(16, 24);
        Triangle triangle = new Triangle(20, 24, 30);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}
