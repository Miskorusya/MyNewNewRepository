package hometask7;

// Клас Quadrilateral (чотирикутник)
public abstract class Quadrilateral extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public Quadrilateral(String name, double side1, double side2, double side3, double side4) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide4() {
        return side4;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }
}
