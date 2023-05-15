package homework;
import java.util.Date;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        System.out.println("Уважаемый X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V");
        System.out.println("Insert all the information" +
                " X - это имя пользователя," +
                "Y - порядковый номер ДЗ,\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = input.next();
        System.out.println("Insert the number of homework");
        Integer number_dz = input.nextInt();
        Date date = new Date();

        System.out.printf("Уважаемый %s, Вы выполняете задание номер %d, и делаете это в %tH часов %tM минут в %tA", name, number_dz, date, date, date);



    }
}
