package homework;
import java.util.Scanner;

public class zadaniedomowe18 {
    public static void main(String[] args) {

        //                      Zadanie 1

/*
        int num1 = 5;
        int num2 = 7;

        // Вызов первого метода для вывода суммы чисел
        printSum(num1, num2);

        // Вызов второго метода для получения и вывода суммы чисел
        int sum = getSum(num1, num2);
        System.out.println("Сумма чисел (возвращаемая методом): " + sum);
    }

    // Метод для вывода суммы чисел
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Сумма чисел (выводимая методом): " + sum);
    }

    // Метод для возвращения суммы чисел
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
*/

        //                      Zadanie 2

/*
        int[] numbers = {2, 5, 8, 3, 10, 7};

        printEvenNumbers(numbers); // Вывод четных чисел
        printOddNumbers(numbers); // Вывод нечетных чисел
    }

    // Метод для вывода четных чисел
    public static void printEvenNumbers(int[] array) {
        System.out.println("Четные числа:");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Метод для вывода нечетных чисел
    public static void printOddNumbers(int[] array) {
        System.out.println("Нечетные числа:");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
*/

        //                      Zadanie 3

/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Число в обратном порядке: ");
        reverseNumber(number);
    }

    public static void reverseNumber(int number) {
        // Базовый случай: если число состоит из одной цифры
        if (number < 10) {
            System.out.print(number + "" + number + " ");
            return;
        }

        // Рекурсивный случай: разбиваем число на последнюю цифру и оставшиеся цифры
        int lastDigit = number % 10;
        int remainingDigits = number / 10;

        // Рекурсивный вызов для оставшихся цифр
        reverseNumber(remainingDigits);

        // Выводим последнюю цифру два раза, после каждой повторенной цифры ставим пробел
        System.out.print(lastDigit + "" + lastDigit + " ");
*/

        //                      Zadanie 4

/*
        printMessage();
        printMessage("Hello, World!");
        printMessage(new String[]{"Hello", "World"});
        printMessage(new int[]{1, 2, 3, 4, 5});
        printMessage(42, "OpenAI");
    }

    public static void printMessage() {
        System.out.println("Я пустой");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(String[] messages) {
        for (String message : messages) {
            System.out.print(message + " ");
        }
        System.out.println();
    }

    public static void printMessage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void printMessage(int number, String message) {
        System.out.println("Ваше сообщение - " + message + ", ваше число - " + number);
*/


        //                      Zadanie 5

        conspect18 conspect = new conspect18();
        conspect.setSubjectName("Математика");
        conspect.setStudentName("Иванов Иван Иванович");
        conspect.setPageCount(50);
        conspect.setYear(2022);
        conspect.setCoverColor("Зеленый");
        conspect.setInstitutionName("Университет UJ");

        System.out.println("Название предмета: " + conspect.getSubjectName());
        System.out.println("ФИО студента: " + conspect.getStudentName());
        System.out.println("Количество страниц: " + conspect.getPageCount());
        System.out.println("Год выпуска: " + conspect.getYear());
        System.out.println("Цвет обложки: " + conspect.getCoverColor());
        System.out.println("Название заведения: " + conspect.getInstitutionName());

    }
}
