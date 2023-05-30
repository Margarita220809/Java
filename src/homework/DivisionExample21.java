package homework;

import java.util.Random;
import java.util.Scanner;

public class DivisionExample21 {
    public static void main(String[] args) {
        divideNumbers();
    }

    public static void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите число: ");
        int userInput = scanner.nextInt();

        int randomNumber = random.nextInt(21) - 10;
        System.out.println("Сгенерированное число: " + randomNumber);

        try {
            if (randomNumber == 0) {
                throw new ArithmeticException("Сгенерированное число равно нулю");
            }

            double quotient = userInput / (double) randomNumber;

            if (quotient < 0) {
                throw new ArithmeticException("Частное отрицательное");
            }

            System.out.println("Введенное число: " + userInput);
            System.out.println("Частное чисел: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
