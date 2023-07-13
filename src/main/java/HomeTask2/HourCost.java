package HomeTask2;

import java.util.Scanner;

public class HourCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кількість робочих годин на тиждень: ");
        double hoursPerWeek = scanner.nextDouble();

        System.out.print("Річна зарплата з податками: ");
        double yearlySalaryWithTax = scanner.nextDouble();

        System.out.print("Відсоток податку: ");
        double taxPercentage = scanner.nextDouble();

        double monthlySalaryWithTax = yearlySalaryWithTax / 12;
        double monthlySalaryWithoutTax = monthlySalaryWithTax / (1 - taxPercentage / 100);
        double hourlyRate = monthlySalaryWithoutTax / (hoursPerWeek * 4);

        System.out.println("При " + hoursPerWeek + " робочих годинах на тиждень з річною зарплатою в " + yearlySalaryWithTax + " та податком " + taxPercentage + "%");
        System.out.println("Година часу коштує " + hourlyRate);
    }
}