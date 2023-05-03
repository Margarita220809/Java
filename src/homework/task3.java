package homework;

public class task3 {
    public static void main(String[] args) {
        String string1 = "This line that I want to cut, cause it is too long";
        String string2 = string1.substring(0,36);
        System.out.println(string2);

        String string3 = string2.replace("I", "I don't");
        System.out.println(string3 + "it is perfect");
        System.out.println(string3.length());
    }
}
