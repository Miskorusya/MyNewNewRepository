package hometask7;

// Клас Rhombus (ромб)
public class Rhombus extends Quadrilateral {
    private double height;

    public Rhombus(String name, double side, double height) {
        super(name, side, side, side, side);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        // Площа ромба рівна (сторона * висота)
        return getSide1() * height;
    }
}
