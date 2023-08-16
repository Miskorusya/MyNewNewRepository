package hometask7;

// Клас Trapezoid (трапеція)
public class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(String name, double base1, double base2, double side1, double side2, double height) {
        super(name, base1, base2, side1, side2);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        // Площа трапеції рівна (півсума основ * висота)
        return 0.5 * (getSide1() + getSide2()) * height;
    }
}
