package Visitor;

public class AreaCalculationVisitorDemo {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 20);
        Circle circle = new Circle(2, 30, 40, 5);
        Rectangle rectangle = new Rectangle(3, 50, 60, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        AreaCalculationVisitor acv = new AreaCalculationVisitor();
        System.out.println(dot.accept(acv));
        System.out.println(circle.accept(acv));
        System.out.println(rectangle.accept(acv));
        System.out.println(compoundShape.accept(acv));

    }
}
