package hometask7;

// Клас IsoscelesTriangle (рівнобедрений трикутник)
public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
    }

    @Override
    public double calculateArea() {
        // Знаходимо висоту трикутника
        double height = Math.sqrt(getSide2() * getSide2() - (getSide1() / 2) * (getSide1() / 2));
        // Площа рівнобедренного трикутника рівна (півпериметр * висота)
        return calculatePerimeter() * height / 2;
    }
}
