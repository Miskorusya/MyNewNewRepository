package hometask11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import hometask7.*;

public class FigureSortingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> figures = new ArrayList<>();

        boolean addMoreFigures = true;
        while (addMoreFigures) {
            System.out.println("Оберіть фігуру для додавання:");
            System.out.println("1. Трикутник");
            System.out.println("2. Коло");
            System.out.println("3. Прямокутник");
            System.out.println("4. Ромб");
            System.out.println("5. Квадрат");
            System.out.println("6. Трапеція");
            System.out.println("7. Рівносторонній трикутник");
            System.out.println("8. Рівнобедрений трикутник");
            System.out.println("9. Прямокутний трикутник");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищуємо буфер після вибору

            switch (choice) {
                case 1:
                    System.out.print("Введіть назву трикутника: ");
                    String triangleName = scanner.nextLine();
                    System.out.print("Введіть довжину першої сторони: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Введіть довжину другої сторони: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Введіть довжину третьої сторони: ");
                    double side3 = scanner.nextDouble();

                    figures.add(new Triangle(triangleName, side1, side2, side3) {
                        @Override
                        public double calculateArea() {
                            return 0;
                        }
                    });
                    break;

                case 2:
                    System.out.print("Введіть назву кола: ");
                    String circleName = scanner.nextLine();
                    System.out.print("Введіть радіус кола: ");
                    double radius = scanner.nextDouble();

                    figures.add(new Circle(circleName, radius));
                    break;

                case 3:
                    System.out.print("Введіть назву прямокутника: ");
                    String rectangleName = scanner.nextLine();
                    System.out.print("Введіть довжину: ");
                    double length = scanner.nextDouble();
                    System.out.print("Введіть ширину: ");
                    double width = scanner.nextDouble();

                    figures.add(new Rectangle(rectangleName, length, width));
                    break;

                case 4:
                    System.out.print("Введіть назву ромба: ");
                    String rhombusName = scanner.nextLine();
                    System.out.print("Введіть довжину сторони: ");
                    double rhombusSide = scanner.nextDouble();
                    System.out.print("Введіть висоту: ");
                    double rhombusHeight = scanner.nextDouble();

                    figures.add(new Rhombus(rhombusName, rhombusSide, rhombusHeight));
                    break;

                case 5:
                    System.out.print("Введіть назву квадрата: ");
                    String squareName = scanner.nextLine();
                    System.out.print("Введіть довжину сторони: ");
                    double squareSide = scanner.nextDouble();

                    figures.add(new Square(squareName, squareSide));
                    break;

                case 6:
                    System.out.print("Введіть назву трапеції: ");
                    String trapezoidName = scanner.nextLine();
                    System.out.print("Введіть довжину першої основи: ");
                    double base1 = scanner.nextDouble();
                    System.out.print("Введіть довжину другої основи: ");
                    double base2 = scanner.nextDouble();
                    System.out.print("Введіть довжину першої сторони: ");
                    double trapezoidSide1 = scanner.nextDouble();
                    System.out.print("Введіть довжину другої сторони: ");
                    double trapezoidSide2 = scanner.nextDouble();
                    System.out.print("Введіть висоту: ");
                    double trapezoidHeight = scanner.nextDouble();

                    figures.add(new Trapezoid(trapezoidName, base1, base2, trapezoidSide1, trapezoidSide2, trapezoidHeight));
                    break;

                case 7:
                    System.out.print("Введіть назву рівностороннього трикутника: ");
                    String equilateralTriangleName = scanner.nextLine();
                    System.out.print("Введіть довжину сторони: ");
                    double equilateralTriangleSide = scanner.nextDouble();

                    figures.add(new EquilateralTriangle(equilateralTriangleName, equilateralTriangleSide));
                    break;

                case 8:
                    System.out.print("Введіть назву рівнобедреного трикутника: ");
                    String isoscelesTriangleName = scanner.nextLine();
                    System.out.print("Введіть довжину першої сторони: ");
                    double isoscelesSide1 = scanner.nextDouble();
                    System.out.print("Введіть довжину другої сторони: ");
                    double isoscelesSide2 = scanner.nextDouble();
                    System.out.print("Введіть довжину третьої сторони: ");
                    double isoscelesSide3 = scanner.nextDouble();

                    figures.add(new IsoscelesTriangle(isoscelesTriangleName, isoscelesSide1, isoscelesSide2, isoscelesSide3));
                    break;

                case 9:
                    System.out.print("Введіть назву прямокутного трикутника: ");
                    String rightTriangleName = scanner.nextLine();
                    System.out.print("Введіть довжину першого катета: ");
                    double rightTriangleSide1 = scanner.nextDouble();
                    System.out.print("Введіть довжину другого катета: ");
                    double rightTriangleSide2 = scanner.nextDouble();
                    System.out.print("Введіть довжину гіпотенузи: ");
                    double rightTriangleSide3 = scanner.nextDouble();

                    figures.add(new RightTriangle(rightTriangleName, rightTriangleSide1, rightTriangleSide2, rightTriangleSide3));
                    break;

                default:
                    System.out.println("Невірний вибір.");
            }

            System.out.print("Додати ще фігуру? (yes/no): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                addMoreFigures = false;
            }
        }

        // Сортування фігур за площею та периметром
        Collections.sort(figures, new Comparator<Shape>() {
            @Override
            public int compare(Shape shape1, Shape shape2) {
                double area1 = shape1.calculateArea();
                double area2 = shape2.calculateArea();
                if (area1 != area2) {
                    return Double.compare(area1, area2);
                }
                double perimeter1 = shape1.calculatePerimeter();
                double perimeter2 = shape2.calculatePerimeter();
                return Double.compare(perimeter1, perimeter2);
            }
        });

        // Виведення результату
        System.out.println("============= Список фігур: ===============");
        for (int i = 0; i < figures.size(); i++) {
            Shape shape = figures.get(i);
            System.out.println((i + 1) + ". [" + shape.getClass().getSimpleName() +
                    "]: Площа = " + shape.calculateArea() + " Периметр = " + shape.calculatePerimeter());
        }
    }
}
