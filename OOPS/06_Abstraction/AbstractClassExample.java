abstract class AbstractShape {
    abstract double area();

    void printArea() {
        System.out.println("Area: " + area());
    }
}

class AbstractCircle extends AbstractShape {
    private final double radius;

    AbstractCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        AbstractShape circle = new AbstractCircle(5);
        circle.printArea();
    }
}