package hometask10;

import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть речення: ");
        String sentence = scanner.nextLine();

        int totalLetterCount = countLetters(sentence);

        System.out.println("Загальна кількість літер в реченні: " + totalLetterCount);
    }

    public static int countLetters(String sentence) {
        int letterCount = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        return letterCount;
    }
}
