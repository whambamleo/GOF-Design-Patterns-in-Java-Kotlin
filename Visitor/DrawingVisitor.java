package Visitor;

public class DrawingVisitor implements Visitor {
    @Override
    public String visitDot(Dot dot) {
        return "Drawing Dot at (" + dot.getX() + ", " + dot.getY() + ")";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "Drawing Circle with radius " + circle.getRadius() + " at (" + circle.getX() + ", " + circle.getY() + ")";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "Drawing Rectangle with width " + rectangle.getWidth() + " and height " + rectangle.getHeight() +
                " at (" + rectangle.getX() + ", " + rectangle.getY() + ")";
    }

    @Override
    public String visitCompoundShape(CompoundShape compoundShape) {
        StringBuilder result = new StringBuilder("Drawing CompoundShape with children:\n");
        for (Shape child : compoundShape.children) {
            result.append("CompoundShape component: ").append(child.accept(this)).append("\n");
        }
        return result.toString();
    }
}
