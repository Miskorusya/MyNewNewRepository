package hometask15;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String solve() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return String.format("Рівняння %.2fx^2 + %.2fx + %.2f = 0 має корені:%n" +
                    "x1 = %.2f%n" +
                    "x2 = %.2f", a, b, c, x1, x2);
        } else if (discriminant == 0) {
            double x1 = -b / (2 * a);
            return String.format("Рівняння %.2fx^2 + %.2fx + %.2f = 0 має один корінь:%n" +
                    "x1 = %.2f", a, b, c, x1);
        } else {
            return "Рівняння не має дійсних коренів.";
        }
    }
}