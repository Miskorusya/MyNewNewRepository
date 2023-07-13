package HomeTask3;

import java.util.Scanner;

public class NumInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число: ");
        double num1 = scanner.nextDouble();

        if (num1 % 2 == 0) {
            System.out.println("Число парне");
        } else {
            System.out.println("Число непарне");
        }

        if (num1 > 0) {
            System.out.println("Число додатнє");
        } else if (num1 < 0) {
            System.out.println("Число від'ємне");
        } else {
            System.out.println("Число дорівнює нулю");
        }

        boolean isPrime = true;
        if (num1 > 1) {
            for (int i = 2; i < num1; i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Число просте");
            } else {
                System.out.println("Число складене");
            }
        } else {
            System.out.println("Число складене");
        }
    }
}