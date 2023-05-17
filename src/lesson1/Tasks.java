package lesson1;
import java.util.Scanner;
import java.util.Date;
public class Tasks {
    public static void main(String[] args){
    //                                Task 1
/*        String string1 = "My name is NAME. I am AGE years old. But I feel myself on NEWaGE!";
        String string2 = string1.replace("NAME", "%1$s")
                .replace("AGE", "%2$d")
                .replace("NEWaGE", "%3$d");

        System.out.printf(string2, "Margo", 20, 18);*/

    //                            Task 2
   /* Scanner Task1 = new Scanner(System.in);
        Date date = new Date();
        System.out.println("Insert the text");
        String string2 = Task1.nextLine();
        String[] string1 = string2.split(" ");
        String string3 = string1[1];
        String string4 = string2.replace(string3, "\nof course\n");
        System.out.println(string4);

        System.out.printf("Printed today on %1$tA, at %1$tH:%1$tM", date);*/

     //                           Task 3

/*
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String st = in.nextLine();
        String result = "";
        //System.out.println(st.split("\\d").length);
        //проверяем что в данном массиве есть хоть одно числовое значение
        if (st.split("\\d").length == 1) {
            System.out.println("В данной строке нет цифр");
        } else {
            //проходимся по всем символам строки.
            for (int i = 0; i < st.length(); i++) {
                if (Character.isDigit(st.charAt(i))) {
                    result = result + st.charAt(i);
                    if (i + 1 != st.length() && Character.isDigit(st.charAt(i + 1))) {
                        while ((i + 1 != st.length()) && Character.isDigit(st.charAt(i + 1))) {
                            i = i + 1;
                            result = result + st.charAt(i);
                        }
                    }
                    result = result + " ";
                }
            }
        }
        System.out.println(result);
        String[] numbers = result.split(" ");
        int [] finalarray = new int [result.split("\\s").length];
        for (int w = 0; w < numbers.length; w++)
        {
            finalarray[w] = Integer.valueOf(numbers[w]);
            System.out.print(finalarray[w] + " ");
        }
        for ( int i = finalarray.length - 1; i >= 0; i--)
        {
            int max;
            for(int a = i - 1; a >= 0; a--)
            {
                if(finalarray[i] < finalarray[a])
                {
                    max = finalarray[a];
                    finalarray[a] = finalarray[i];
                    finalarray[i] = max;
                }
            }
        }
        System.out.println("");
        for(int i = 0; i < finalarray.length; i++)
        {
            System.out.println(finalarray[i]);
        }*/

   //                             Task 4

    /*    String[] strings = {"one", "two", "three", "four"};
        for(String x:strings)
        {
            int[] ints = new int[6];
            for (int number: ints)
            {
                number = ((int) (Math.random() * 11));
            }
            for(int i = 0; i < ints.length; i++)
            {
                ints[i] = ((int) (Math.random() * 11));
            }
            for(int number: ints)
            {
                System.out.println(number);
            }*/

  //                                  Task 5

        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        for ( int[] arraynumbers:numbers)
        {
            for(int number:arraynumbers)
            {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
        int [][] x = new int[3][6];
        int [][] numbers2 = {{1,2,3,4},{5,6},{7,8,9,10,11}};

        for ( int[] arraynumbers:numbers2)
        {
            for(int number:arraynumbers)
            {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }
    }

