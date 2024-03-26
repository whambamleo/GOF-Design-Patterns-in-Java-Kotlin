package Visitor;

public class DrawingVisitorDemo {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 20);
        Circle circle = new Circle(2, 30, 40, 5);
        Rectangle rectangle = new Rectangle(3, 50, 60, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        DrawingVisitor drawingVisitor = new DrawingVisitor();
        System.out.println(dot.accept(drawingVisitor));
        System.out.println(circle.accept(drawingVisitor));
        System.out.println(rectangle.accept(drawingVisitor));
        System.out.println(compoundShape.accept(drawingVisitor));

    }
}