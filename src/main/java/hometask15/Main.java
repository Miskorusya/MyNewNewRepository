package hometask15;
public class Main {
    public static void main(String[] args) {
        // Створення об'єкту квадратного рівняння з вказаними коефіцієнтами
        QuadraticEquation equation1 = new QuadraticEquation(1, -3, 2);

        // Розв'язання та виведення результату для першого рівняння
        String result1 = equation1.solve();
        System.out.println("Рівняння 1:");
        System.out.println(result1);

        // Створення іншого об'єкту квадратного рівняння з іншими коефіцієнтами
        QuadraticEquation equation2 = new QuadraticEquation(2, 5, -3);

        // Розв'язання та виведення результату для другого рівняння
        String result2 = equation2.solve();
        System.out.println("Рівняння 2:");
        System.out.println(result2);
    }
}