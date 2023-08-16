package hometask7;

// Клас Parallelogram (паралелограм)
public class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(String name, double base, double side, double height) {
        super(name, base, side, base, side);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        // Площа паралелограма рівна (основа * висота)
        return getSide1() * height;
    }
}
