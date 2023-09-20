package hometask15;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть коефіцієнт a:");
        double a = scanner.nextDouble();

        System.out.println("Введіть коефіцієнт b:");
        double b = scanner.nextDouble();

        System.out.println("Введіть коефіцієнт c:");
        double c = scanner.nextDouble();

        String result = solve(a, b, c);
        System.out.println(result);

        scanner.close();
    }

    public static String solve(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return String.format("Рівняння %.2fx^2 + %.2fx + %.2f = 0 має корені:%n" +
                    "x1 = %.2f%n" +
                    "x2 = %.2f%n", a, b, c, x1, x2);
        } else if (discriminant == 0) {
            double x1 = -b / (2 * a);
            return String.format("Рівняння %.2fx^2 + %.2fx + %.2f = 0 має один корінь:%n" +
                    "x1 = %.2f%n", a, b, c, x1);
        } else {
            return "Рівняння не має дійсних коренів";
        }
    }
}