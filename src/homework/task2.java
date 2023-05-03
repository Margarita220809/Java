package homework;

public class task2 {
    public static void main(String[] args) {

        double chislitel = 7.0;
        double znamenatel = 5.0;
        int a = (int) (chislitel/znamenatel);
        int b = (int) (chislitel%znamenatel);
        System.out.println("Целая часть равна - " + a);
        System.out.println("Остаток от деления равен - " + b);
        System.out.println("Знаменатель равен - " + (int)znamenatel);

    }
}
