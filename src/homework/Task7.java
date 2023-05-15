package homework;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner Task2 = new Scanner(System.in);
        System.out.println("Write the first number : ");
        Integer a = Task2.nextInt();
        System.out.println("Write the second number : ");
        Integer b = Task2.nextInt();
        System.out.println("Write the third number : ");
        Integer c = Task2.nextInt();

        if((a + b > c) && (a + c > b) && (b + c > a))
            System.out.println("U can make the triangle");
        else
            System.out.println("U can't make the triangle");

    }
}
