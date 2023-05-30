package homework;

public class Seller extends Person {
    private boolean honest;

    public Seller(String name, int age, boolean honest) {
        super(name, age);
        this.honest = honest;
    }

    public boolean isHonest() {
        return honest;
    }

    @Override
    public void role() {
        System.out.println("Я продавец");
    }
}
