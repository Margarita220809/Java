package homework;

public class Shop {
    public void returnCost(Person buyer, Seller seller, String productName, double price) {
        String shopName = "Мой магазин"; // Название магазина

        // Вывод информации о покупке
        System.out.println("Уважаемый " + buyer.getName() + ", продавец " + seller.getName() +
                " нашего магазина \"" + shopName + "\", продаст вам этот товар \"" + productName +
                "\", в них есть алкогольная продукция, а ваш возраст " + buyer.getAge() + ".");

        double totalCost = price; // Стоимость покупки

        // Применение скидки для покупателя со скидочной картой
        if (buyer instanceof BuyerWithDiscountCard) {
            totalCost -= (totalCost * 0.1); // Скидка 10%
            System.out.println("Стоимость вашей покупки равна " + totalCost + ". Вот вам скидка.");
        } else {
            System.out.println("Стоимость вашей покупки равна " + totalCost + ".");
        }
    }
}
