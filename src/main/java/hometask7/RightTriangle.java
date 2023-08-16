package hometask7;

// Клас RightTriangle (прямокутний трикутник)
public class RightTriangle extends Triangle {
    public RightTriangle(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
    }

    @Override
    public double calculateArea() {
        // Площа прямокутного трикутника рівна (периметр / 2)
        return calculatePerimeter() / 2;
    }
}
