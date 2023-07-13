package HomeTask3;

import java.util.Scanner;

public class UnitCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Вартість товару за одиницю: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Кількість товару: ");
        int quantity = scanner.nextInt();

        double totalCost;

        if (quantity > 80) {
            totalCost = unitPrice * quantity * 0.87; // 13% знижка
        } else if (quantity > 30) {
            int additionalQuantity = quantity - 30;
            double discount = 0.12 + (additionalQuantity / 10) * 0.004;
            totalCost = unitPrice * quantity * (1 - discount);
        } else if (quantity > 20) {
            totalCost = unitPrice * quantity * 0.9; // 10% знижка
        } else if (quantity > 10) {
            totalCost = unitPrice * quantity * 0.95; // 5% знижка
        } else {
            totalCost = unitPrice * quantity;
        }

        System.out.println("Загальна сума товару: " + totalCost);
    }
}
