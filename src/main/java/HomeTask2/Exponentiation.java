package HomeTask2;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть ступінь: ");
        double num2 = scanner.nextDouble();

        double result = Math.pow(num1, num2);
        System.out.println("Результат піднесення в ступінь: " + result);
    }
}
