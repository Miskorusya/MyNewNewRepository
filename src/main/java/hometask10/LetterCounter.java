package hometask10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть речення: ");
        String sentence = scanner.nextLine();

        Map<Character, Integer> letterCountMap = countLetters(sentence);

        System.out.println("Кількість кожної літери в реченні:");
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }

        int totalLetterCount = getTotalLetterCount(letterCountMap);
        System.out.println("Загальна кількість літер в реченні: " + totalLetterCount);
    }

    public static Map<Character, Integer> countLetters(String sentence) {
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowercaseC = Character.toLowerCase(c);
                letterCountMap.put(lowercaseC, letterCountMap.getOrDefault(lowercaseC, 0) + 1);
            }
        }

        return letterCountMap;
    }

    public static int getTotalLetterCount(Map<Character, Integer> letterCountMap) {
        int total = 0;
        for (int count : letterCountMap.values()) {
            total += count;
        }
        return total;
    }
}
