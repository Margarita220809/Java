package homework;

public class zadanie19 {

    public static void main(String[] args) {

        //                  Zadanie 1
/*
        Computer19 computer = new Computer19("Dell", 1000, 8, 4);
        computer.printInfo();
*/

        //                  Zadanie 2

/*
        Tree19 tree1 = new Tree19("Береза", 250);
        Tree19 tree2 = new Tree19(300, 15, "Красный");
        Tree19 tree3 = new Tree19();
        Tree19 tree4 = new Tree19("Сосна");

        // Выводим информацию о каждом объекте
        System.out.println("Дерево 1:");
        printTreeInfo(tree1);
        System.out.println();

        System.out.println("Дерево 2:");
        printTreeInfo(tree2);
        System.out.println();

        System.out.println("Дерево 3:");
        printTreeInfo(tree3);
        System.out.println();

        System.out.println("Дерево 4:");
        printTreeInfo(tree4);
    }

    public static void printTreeInfo(Tree19 tree) {
        System.out.println("Тип: " + tree.getType());
        System.out.println("Высота: " + tree.getHeight());
        System.out.println("Количество палок: " + tree.getCountOfSticks());
        System.out.println("Цвет: " + tree.getColour());
*/

        //                  Zadanie 3

/*
        Converter19 converter = new Converter19("MyConverter");

        int intValue = converter.convertToInt(42);
        double doubleValue = converter.convertToDouble(3.14);
        String stringValue = converter.convertToString(true);

        System.out.println("Имя конвертера: " + converter.getName());
        System.out.println("Результат конвертации в int: " + intValue);
        System.out.println("Результат конвертации в double: " + doubleValue);
        System.out.println("Результат конвертации в String: " + stringValue);
*/


        //                  Zadanie 4

        calculator19 calculator = new calculator19();
        calculator.start();

    }
}
