package hometask7;

// Клас Square (квадрат)
public class Square extends Quadrilateral {
    public Square(String name, double side) {
        super(name, side, side, side, side);
    }

    @Override
    public double calculateArea() {
        // Площа квадрата рівна (сторона^2)
        return getSide1() * getSide1();
    }
}
