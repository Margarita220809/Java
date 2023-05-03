package homework;

public class task4 {
    public static void main(String[] args) {
        boolean c = true;

        String string = "Testing, is my favourite job";
        String[] words = string.split(" ");
        String string0 = words[0].replace("," , "");
        String string1 = words[1];
        String string2 = words[2];
        String string3 = words[3];
        String string4 = words[4];

        int a = string1.length();
        int b = string2.length();
        int e = string3.length();
        int d = string4.length();

        System.out.println("Cлово1 = "+string0 +", Длина этого слова = " + string0.length());
        System.out.println("Cлово2 = "+string1 +", Длина этого слова = " + a);
        System.out.println("Cлово3 = "+string2 +", Длина этого слова = " + b);
        System.out.println("Cлово4 = "+string3 +", Длина этого слова = " + e);
        System.out.println("Cлово5 = "+string4 +", Длина этого слова = " + d);

        if (string0.length()> a && string0.length()> b && string0.length()> e && string0.length()> d)
            System.out.println(c);
            else
                System.out.println(!c);

    }
}
