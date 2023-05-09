package lesson1;
import java.util.Scanner;
import java.util.Date;
public class Tasks {
    public static void main(String[] args){
    //                                Task 1
//        String string1 = "My name is NAME. I am AGE years old. But I feel myself on NEWaGE!";
//        String string2 = string1.replace("NAME", "%1$s")
//                .replace("AGE", "%2$d")
//                .replace("NEWaGE", "%3$d");
//
//        System.out.printf(string2, "Margo", 20, 18);

    //                            Task 2
    Scanner Task1 = new Scanner(System.in);
        Date date = new Date();
        System.out.println("Insert the text");
        String string2 = Task1.nextLine();
        String[] string1 = string2.split(" ");
        String string3 = string1[1];
        String string4 = string2.replace(string3, "\nof course\n");
        System.out.println(string4);



        System.out.printf("Printed today on %1$tA, at %1$tH:%1$tM", date);


    }
}
