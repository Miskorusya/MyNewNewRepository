package hometask15;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту квадратного рівняння з вказаними коефіцієнтами
        QuadraticEquation equation1 = new QuadraticEquation(1, -3, 2);

        // Розв'язання та виведення результату для першого рівняння
        double[] roots1 = equation1.solve();
        System.out.println("Рівняння 1:");
        printRoots(roots1);

        // Створення іншого об'єкту квадратного рівняння з іншими коефіцієнтами
        QuadraticEquation equation2 = new QuadraticEquation(2, 5, -3);

        // Розв'язання та виведення результату для другого рівняння
        double[] roots2 = equation2.solve();
        System.out.println("Рівняння 2:");
        printRoots(roots2);
    }

    // Метод для виведення коренів
    private static void printRoots(double[] roots) {
        if (roots.length == 0) {
            System.out.println("Рівняння не має дійсних коренів.");
        } else {
            System.out.print("Корені: ");
            for (double root : roots) {
                System.out.print(root + " ");
            }
            System.out.println();
        }
    }
}