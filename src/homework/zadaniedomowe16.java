package homework;
import java.util.Scanner;
public class zadaniedomowe16 {

//                              Zadanie 1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
            System.out.println("Какая программа вас интересует?");
            System.out.println("1. IntelliJ IDEA");
            System.out.println("2. Git");
            System.out.println("3. Java");
            int programChoice = scanner.nextInt();

            System.out.println("Какую операционную систему вы используете?");
            System.out.println("1. Linux");
            System.out.println("2. macOS");
            System.out.println("3. Windows");
            int osChoice = scanner.nextInt();

            String downloadLink = getDownloadLink(programChoice, osChoice);
            System.out.println(downloadLink);
        }

        public static String getDownloadLink(int programChoice, int osChoice) {
            String downloadLink;

            switch (programChoice) {
                case 1:
                    switch (osChoice) {
                        case 1:
                            downloadLink = "https://www.jetbrains.com/idea/download/linux/";
                            break;
                        case 2:
                            downloadLink = "https://www.jetbrains.com/idea/download/mac/";
                            break;
                        case 3:
                            downloadLink = "https://www.jetbrains.com/idea/download/windows/";
                            break;
                        default:
                            return "Операционная система не существует.";
                    }
                    break;

                case 2:
                    switch (osChoice) {
                        case 1:
                            downloadLink = "https://git-scm.com/download/linux";
                            break;
                        case 2:
                            downloadLink = "https://git-scm.com/download/mac";
                            break;
                        case 3:
                            downloadLink = "https://git-scm.com/download/windows";
                            break;
                        default:
                            return "Операционная система не существует.";
                    }
                    break;

                case 3:
                    switch (osChoice) {
                        case 1:
                            downloadLink = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                            break;
                        case 2:
                            downloadLink = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                            break;
                        case 3:
                            downloadLink = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                            break;
                        default:
                            return "Операционная система не существует.";
                    }
                    break;

                default:
                    return "Программа не существует.";
            }

            return "Ссылка для загрузки: " + downloadLink;
        }
*/

        //                              Zadanie 2




/*
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int count = 0;
        int index = 0;
        while (index < input.length()) {
            if (input.charAt(index) == 'a') {
                count++;
            }
            index++;
        }

        System.out.println("Количество символов 'a' в строке: " + count);
*/

        //                              Zadanie 3

/*
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Понедельник");
        } else if (number == 2) {
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6) {
            System.out.println("Суббота");
        } else if (number == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }
*/

//                              Zadanie 4


/*
        System.out.println("Введите слова. Для остановки введите 'STOP':");

        StringBuilder sentenceBuilder = new StringBuilder();
        String word = scanner.nextLine();

        while (!word.equalsIgnoreCase("STOP")) {
            sentenceBuilder.append(word).append(" ");
            word = scanner.nextLine();
        }

        String sentence = sentenceBuilder.toString().trim();
        System.out.println("Полученное предложение: " + sentence);
*/

//                              Zadanie 5



/*
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Число является палиндромом.");
        } else {
            System.out.println("Число не является палиндромом.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
*/

        //                              Zadanie 5


        System.out.println("Введите вес, который может быть принят на склад:");
        double maxWeight = scanner.nextDouble();

        double remainingWeight = maxWeight;

        while (remainingWeight > 0) {
            System.out.println("Введите вес металла для сдачи на склад:");
            double metalWeight = scanner.nextDouble();

            if (metalWeight < 5) {
                System.out.println("Невозможно принять металл весом меньше 5.");
                continue;
            }

            if (metalWeight > remainingWeight) {
                System.out.println("Недостаточно места на складе для принятия данного веса металла.");
                break;
            }

            remainingWeight -= metalWeight;
            System.out.println("Остаток места на складе: " + remainingWeight);
        }

        System.out.println("Место на складе закончилось.");


    }
}





