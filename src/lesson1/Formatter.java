package lesson1;

import java.util.Date;
public class Formatter {
    public static void main(String[] args) {

  /*    System.out.printf("After %n everything is great%n");
        System.out.printf("Everything is %b%n", 6);
        System.out.printf("%b is okay%n", "String");
        System.out.printf("Everything is %b%n", null);
        System.out.printf("Everything is %b%n", true);
        System.out.printf("Everything is %b%n", false);*/

//        System.out.printf("In here %2$s should be here. And here also %1$s", "String1", "String2");

//        System.out.printf("In here %15s should be here. And here also %-15s alright%n", "String1", "String2");
//        System.out.printf("In here %2.4s should be here. And here also %3.6s%n", "String1", "String2");
//        System.out.printf("Tekst %c should be here %n", 'x');

        Date date = new Date();
        System.out.println(date);
        // H - hours , M - minutes , S - seconds , L - miliseconds , N - nanoseconds
        System.out.printf("Now the time is %tT\n", date);
        System.out.printf("Now the time is %1$tH:%1$tM:%1$tS:%1$tL:%1$tN %1$tp \n", date);

        // A - dzień tygodnia, d - data w cyfrach, B - nazwa miesiąca, m - miesiąc w cyfrach
        //Y - Caly format roku(2023), y - dwie ostatnie cyfry roku(23)
        System.out.printf("Now the date is  in that format %1$tA %1$tB %1$tY\n", date);
        System.out.printf("Now the date is  in another format %1$td:%1$tm:%1$ty\n", date);
        System.out.printf("Now the date is  in that format %1$tA %1$td %1$tB\n", date);
        String date2 = String.format("%1$tA %1$tB %1$tY", date);

    }
}
