package hometask7;

// Клас EquilateralTriangle (рівносторонній трикутник)
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public double calculateArea() {
        // Площа рівностороннього трикутника рівна (сторона^2 * √3 / 4)
        return (getSide1() * getSide1() * Math.sqrt(3)) / 4;
    }
}
