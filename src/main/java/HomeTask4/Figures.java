package HomeTask4;
import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {

            System.out.println("1. Прямокутник");
            System.out.println("2. Прямокутний трикутник");
            System.out.println("3. Зворотній прямокутний трикутник");
            System.out.println("4. Трикутник");
            System.out.println("Виберіть фігуру: ");

            int figureChoice = scanner.nextInt();
            scanner.nextLine(); // Зчитуємо решту рядка після вибору фігури

            switch (figureChoice) {
                case 1:
                    System.out.print("Введіть висоту прямокутника: ");
                    int height = scanner.nextInt();
                    System.out.print("Введіть ширину прямокутника: ");
                    int width = scanner.nextInt();
                    drawRectangle(height, width);
                    break;
                case 2:
                    System.out.print("Введіть висоту прямокутного трикутника: ");
                    int triangleHeight = scanner.nextInt();
                    drawRightTriangle(triangleHeight, false);
                    break;
                case 3:
                    System.out.print("Введіть висоту зворотного прямокутного трикутника: ");
                    int invertedTriangleHeight = scanner.nextInt();
                    drawRightTriangle(invertedTriangleHeight, true);
                    break;
                case 4:
                    System.out.print("Введіть висоту трикутника: ");
                    int triangleHeight2 = scanner.nextInt();
                    drawTriangle(triangleHeight2);
                    break;
                default:
                    System.out.println("Невірний вибір фігури.");
            }

            System.out.print("Бажаєте вивести ще одну фігуру? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));
    }

    private static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle(int height, boolean inverted) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawTriangle(int height) {
        int spaces = height - 1;
        int stars = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}
