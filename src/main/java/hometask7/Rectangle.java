package hometask7;

// Клас Rectangle (прямокутник)
public class Rectangle extends Quadrilateral {
    private double height;

    public Rectangle(String name, double length, double width) {
        super(name, length, width, length, width);
        this.height = width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        // Площа прямокутника рівна (довжина * ширина)
        return getSide1() * height;
    }
}
