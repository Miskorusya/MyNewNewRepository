package HomeTask4;

import java.util.Scanner;

public class Rozstrochka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть загальну суму кредиту: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Введіть місячний відсоток на залишок по кредиту (%): ");
        double interestRate = scanner.nextDouble();

        System.out.println("Оберіть варіант розрахунку:");
        System.out.println("1. Розрахувати кількість щомісячних платежів");
        System.out.println("2. Розрахувати суму щомісячного платежу");
        System.out.print("Введіть номер варіанту: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введіть суму щомісячного внеску: ");
            double monthlyPayment = scanner.nextDouble();

            int numberOfPayments = calculateNumberOfPayments(loanAmount, interestRate, monthlyPayment);
            System.out.println("Кількість щомісячних платежів: " + numberOfPayments);
        } else if (choice == 2) {
            System.out.print("Введіть кількість платежів: ");
            int numberOfPayments = scanner.nextInt();

            double monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, numberOfPayments);
            System.out.println("Сума щомісячного платежу: " + monthlyPayment);
        } else {
            System.out.println("Невірний варіант розрахунку.");
        }
    }

    private static int calculateNumberOfPayments(double loanAmount, double interestRate, double monthlyPayment) {
        double remainingAmount = loanAmount;
        int numberOfPayments = 0;

        while (remainingAmount > 0) {
            double interest = remainingAmount * interestRate / 100;
            double principal = monthlyPayment - interest;
            remainingAmount -= principal;
            numberOfPayments++;
        }

        return numberOfPayments;
    }

    private static double calculateMonthlyPayment(double loanAmount, double interestRate, int numberOfPayments) {
        double monthlyInterestRate = interestRate / 100 / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        return monthlyPayment;
    }
}
