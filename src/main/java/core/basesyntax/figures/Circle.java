package core.basesyntax.figures;

import core.basesyntax.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Name: " + this.name + ", Color: " + this.color.name() + ", Radius: " + this.radius + ", Area: " + this.getArea() + ".");
    }
}
