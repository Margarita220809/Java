package homework;
import java.util.Scanner;
import java.util.Date;
public class Task9 {
    public static void main(String[] args) {
        System.out.println("Write the Date Format : ");

        Scanner Date = new Scanner(System.in);
        char separator = Date.next().charAt(0);
        Date today = new Date();
        System.out.printf("the date is : %1$tA"+separator+"%1$tB"+separator+"%1$tY", today, today, today);




    }
}
/*import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;
        import java.util.Scanner;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите спецификатор формата (например, yyyy-MM-dd HH:mm:ss): ");
        String format = scanner.nextLine();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        String formattedDateTime = now.format(formatter);
        System.out.println("Текущая дата/время в формате " + format + ": " + formattedDateTime);
    }
}*/
