package homework;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class zadaniedomowe17 {
    public static void main(String[] args) {

        //                          Zadanie 1

/*
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] numbers = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        int index3 = scanner.nextInt();

        String name = names[index1];
        int time = numbers[index2];
        String place = places[index3];

        System.out.printf("%s будет идти в %s в %d:00%n", name, place, time);
*/

        //                          Zadanie 2

/*
        int[] array = generateRandomArray(10);
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int number = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " найдено в массиве.");
        } else {
            System.out.println("Число " + number + " не найдено в массиве.");
        }
    }

    private static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // Генерация случайных чисел от 0 до 99
        }
        return array;
*/

        //                          Zadanie 3

/*
        int[] array = new int[45];
        Random random = new Random();

        // Заполнение массива случайными числами от -50 до +50
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50; // Генерация случайных чисел от -50 до +50
        }

        // Поиск минимального элемента
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Поиск максимального элемента
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Вывод минимального и максимального элементов на консоль
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
*/

        //                          Zadanie 4

/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (четное число): ");
        int size = scanner.nextInt();

        // Проверка на четность размера массива
        if (size % 2 != 0) {
            System.out.println("Размер массива должен быть четным!");
            return;
        }

        int[] array = generateRandomArray(size);
        System.out.println("Изначальный массив: " + Arrays.toString(array));

        int[] sortedArray = sortArray(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101); // Генерация случайных чисел от 0 до 100
        }
        return array;
    }

    private static int[] sortArray(int[] array) {
        int halfSize = array.length / 2;

        // Сортировка первой половины массива по возрастанию
        Arrays.sort(array, 0, halfSize);

        // Сортировка второй половины массива по убыванию
        for (int i = halfSize, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
*/

        //                          Zadanie 5


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание треугольника: ");
        int base = scanner.nextInt();

        // Вывод заполненного треугольника
        System.out.println("Заполненный треугольник:");
        for (int i = 0; i < base; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Вывод пустого треугольника
        System.out.println("\nПустой треугольник:");
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
