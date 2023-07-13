import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть вартість години: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Введіть відсоток податку: ");
        double taxRate = scanner.nextDouble();

        double[] monthlySalaryWithoutTax = new double[12];
        double[] monthlySalaryWithTax = new double[12];

        int totalWorkingDays = 0;

        for (int month = 0; month < 12; month++) {
            int daysInMonth = getDaysInMonth(month);
            int workingDays = daysInMonth - getTotalWeekends(month, daysInMonth);

            totalWorkingDays += workingDays;

            monthlySalaryWithoutTax[month] = calculateMonthlySalary(hourlyRate, workingDays);
            monthlySalaryWithTax[month] = monthlySalaryWithoutTax[month] * (100 - taxRate) / 100;
        }

        double annualSalaryWithoutTax = calculateAnnualSalary(monthlySalaryWithoutTax);
        double annualSalaryWithTax = calculateAnnualSalary(monthlySalaryWithTax);

        for (int month = 0; month < 12; month++) {
            String monthName = getMonthName(month);
            System.out.println(monthName + " " + monthlySalaryWithoutTax[month] + " " + monthlySalaryWithTax[month]);
        }

        System.out.println("TOTAL: " + annualSalaryWithoutTax + " " + annualSalaryWithTax);
    }

    private static int getDaysInMonth(int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month];
    }

    private static int getTotalWeekends(int month, int daysInMonth) {
        int[] weekends = new int[daysInMonth];
        int totalWeekends = 0;

        for (int day = 1; day <= daysInMonth; day++) {
            int dayOfWeek = getDayOfWeek(month, day);

            if (dayOfWeek == 6 || dayOfWeek == 7) {
                weekends[day - 1] = 1;
                totalWeekends++;
            }
        }

        // Перевірка останніх 14 днів року
        if (month == 11) {
            for (int day = daysInMonth - 13; day <= daysInMonth; day++) {
                weekends[day - 1] = 1;
                totalWeekends++;
            }
        }

        return totalWeekends;
    }

    private static int getDayOfWeek(int month, int day) {
        // День тижня від 1 (понеділок) до 7 (неділя)
        int[] dayOfWeek = {1, 2, 3, 4, 5, 6, 7,};
        int startDayOfWeek = 1; // Початковий день тижня у січні

        // Визначення початкового дня тижня для вказаного місяця
        for (int i = 0; i < month; i++) {
            startDayOfWeek += getDaysInMonth(i) % 7;
        }

        return dayOfWeek[(startDayOfWeek + day - 1) % 7];
    }

    private static double calculateMonthlySalary(double hourlyRate, int workingDays) {
        int workingHoursPerDay = 8;
        return hourlyRate * workingHoursPerDay * workingDays;
    }

    private static double calculateAnnualSalary(double[] monthlySalary) {
        double annualSalary = 0;

        for (double salary : monthlySalary) {
            annualSalary += salary;
        }

        return annualSalary;
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        return monthNames[month];
    }
}
