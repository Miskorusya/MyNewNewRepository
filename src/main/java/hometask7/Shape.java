package hometask7;

// Базовий клас Shape
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактний метод для обчислення площі фігури
    public abstract double calculateArea();

    // Абстрактний метод для обчислення периметра фігури
    public abstract double calculatePerimeter();
}

// Клас Circle (коло)
public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Клас Triangle (трикутник)
public abstract class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

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

// Клас IsoscelesTriangle (рівнобедрений трикутник)
public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(String name, double base, double sides) {
        super(name, base, sides, sides);
    }

    @Override
    public double calculateArea() {
        // Знаходимо висоту трикутника
        double height = Math.sqrt(getSide2() * getSide2() - (getSide1() / 2) * (getSide1() / 2));
        // Площа рівнобедренного трикутника рівна (півпериметр * висота)
        return calculatePerimeter() * height / 2;
    }
}

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
