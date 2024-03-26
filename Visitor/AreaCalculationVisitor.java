package Visitor;

public class AreaCalculationVisitor implements Visitor {
    @Override
    public String visitDot(Dot dot) {
        // Dots theoretically have no area
        return "0";
    }

    @Override
    public String visitCircle(Circle circle) {
        return String.valueOf(Math.PI*Math.pow(circle.getRadius(), 2));
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return String.valueOf(rectangle.getHeight()* rectangle.getWidth());
    }

    @Override
    public String visitCompoundShape(CompoundShape compoundShape) {
        float sum = 0;
        for (Shape shape: compoundShape.children) {
            sum += Float.parseFloat(shape.accept(this));
        }
        return String.valueOf(sum);
    }
}
