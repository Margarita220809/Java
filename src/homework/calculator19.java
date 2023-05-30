package homework;
import java.util.Scanner;

public class calculator19 {



        public void start() {
            System.out.println("Калькулятор запущен.");

            Scanner scanner = new Scanner(System.in);
            String action;

            while (true) {
                System.out.println("Введите действие (или 'Stop' для выхода):");
                action = scanner.nextLine();

                if (action.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрыт.");
                    break;
                }

                if (!isValidAction(action)) {
                    System.out.println("Введите корректное действие.");
                    continue;
                }

                String[] parts = action.split("[+\\-*/]");

                if (parts.length != 2) {
                    System.out.println("Введите корректное действие.");
                    continue;
                }

                double num1 = Double.parseDouble(parts[0].trim());
                double num2 = Double.parseDouble(parts[1].trim());

                if (action.contains("+")) {
                    double result = sum(num1, num2);
                    System.out.println("Результат: " + result);
                } else if (action.contains("-")) {
                    double result = minus(num1, num2);
                    System.out.println("Результат: " + result);
                } else if (action.contains("*")) {
                    double result = multiply(num1, num2);
                    System.out.println("Результат: " + result);
                } else if (action.contains("/")) {
                    if (num2 == 0) {
                        System.out.println("Деление на ноль невозможно.");
                    } else {
                        double result = division(num1, num2);
                        System.out.println("Результат: " + result);
                    }
                }
            }

            scanner.close();
        }

        private boolean isValidAction(String action) {
            return action.matches("^\\s*-?\\d+(\\.\\d+)?\\s*[+\\-*/]\\s*-?\\d+(\\.\\d+)?\\s*$");
        }

        private double sum(double num1, double num2) {
            return num1 + num2;
        }

        private double minus(double num1, double num2) {
            return num1 - num2;
        }

        private double multiply(double num1, double num2) {
            return num1 * num2;
        }

        private double division(double num1, double num2) {
            return num1 / num2;
        }
    }


