package homework;

public class Buyer extends Person {
    public Buyer(String name, int age) {
        super(name, age);
    }

    @Override
    public void role() {
        System.out.println("Я покупатель");
    }
}
