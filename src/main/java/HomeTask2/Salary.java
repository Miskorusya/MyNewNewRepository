package HomeTask2;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кількість робочих годин на тиждень: ");
        double hoursPerWeek = scanner.nextDouble();

        System.out.print("Вартість години: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Відсоток податку: ");
        double taxPercentage = scanner.nextDouble();

        double monthlySalaryWithoutTax = hoursPerWeek * hourlyRate * 4;
        double monthlySalaryWithTax = monthlySalaryWithoutTax * (1 - taxPercentage / 100);
        double yearlySalaryWithoutTax = monthlySalaryWithoutTax * 12;
        double yearlySalaryWithTax = monthlySalaryWithTax * 12;

        System.out.println("Зарплатня на місяць без податків: " + monthlySalaryWithoutTax);
        System.out.println("Зарплатня на місяць з податками: " + monthlySalaryWithTax);
        System.out.println("Зарплатня на рік без податків: " + yearlySalaryWithoutTax);
        System.out.println("Зарплатня на рік з податками: " + yearlySalaryWithTax);
    }
}