package homework;

public class homework20 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Buyer buyer = new Buyer("Иван", 20);
        Seller seller = new Seller("Петр", 30, true);
        String productName = "Вино";
        double price = 100.0;

        shop.returnCost(buyer, seller, productName, price);
    }
}
