package HomeTask3;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Номер місяця (1-12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Невірний місяць");
            return;
        }

        System.out.print("Вартість години: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Відсоток податку: ");
        double taxPercentage = scanner.nextDouble();

        int totalWorkingDays = getWorkingDays(month);
        double totalWorkingHours = totalWorkingDays * 8;

        double salaryWithoutTax = totalWorkingHours * hourlyRate;
        double salaryWithTax = salaryWithoutTax * (1 - taxPercentage / 100);

        System.out.println("Зарплатня за місяць без податку: " + salaryWithoutTax);
        System.out.println("Зарплатня за місяць з податком: " + salaryWithTax);
    }

    private static int getWorkingDays(int month) {
        int totalDays;
        if (month == 2) {
            totalDays = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            totalDays = 30;
        } else {
            totalDays = 31;
        }

        return totalDays - 2; // враховуємо 2 останні дні як вихідні
    }
}