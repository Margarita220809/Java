package lesson1;

import java.util.Scanner;
public class ScannerDan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*    System.out.println("Insert the text");*/
        String string = input.nextLine();
        System.out.println(string);
        String string2 = input.next();
        System.out.println(string2);
    }
}
