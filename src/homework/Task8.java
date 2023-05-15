package homework;
import java.util.Scanner;
import java.util.Date;
import  java.time.Year;
public class Task8 {
    public static void main(String[] args) {
        Scanner Task3 = new Scanner(System.in);
        System.out.println("Write ur year of birth: ");
        Integer year_of_birth = Task3.nextInt();
        Date today = new Date();
        Integer current_year = Year.now().getValue();
        Integer age = current_year-year_of_birth;

        System.out.println("The current age is : " + age);



    }
}
