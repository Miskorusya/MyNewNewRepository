import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть числа через кому: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        Integer[] array = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i].trim());
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        // Сортування від найменшого до найбільшого
        Arrays.sort(array);
        System.out.println("Сортований від найменшого до найбільшого: " + Arrays.toString(array));

        // Сортування від найбільшого до найменшого
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Сортований від найбільшого до найменшого: " + Arrays.toString(array));

        // Розділяємо масив на два
        int evenLength = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Integer[] evenArray = new Integer[evenLength];
        Integer[] oddArray = new Integer[array.length - evenArray.length];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenArray[i / 2] = array[i];
            } else {
                oddArray[(i - 1) / 2] = array[i];
            }
        }

        // Виводимо перший масив в спадаючому порядку
        Arrays.sort(evenArray, Collections.reverseOrder());
        // System.out.println("Перший масив (спадаючий): " + Arrays.toString(evenArray));

        // Виводимо другий масив в зростаючому порядку
        Arrays.sort(oddArray);
        //System.out.println("Другий масив (зростаючий): " + Arrays.toString(oddArray));

        // Об'єднуємо масиви
        Integer[] mergedArray = mergeArrays(evenArray, oddArray);
        System.out.println("Об'єднаний масив: " + Arrays.toString(mergedArray));
    }

    private static Integer[] mergeArrays(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            mergedArray[index] = array1[i];
            index++;
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[index] = array2[i];
            index++;
        }

        return mergedArray;
    }
}
