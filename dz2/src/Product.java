public class Product {

    // Количество товаров
    private int quantity;

    // Цена товара
    private double price;

    // Скидка на товар (в процентах, например, 10% вводится как 10.0)
    private double discount;

    /**
     * Конструктор для инициализации товара.
     *
     * @param quantity Количество товаров.
     * @param price Цена одного товара.
     * @param discount Скидка на товар (в процентах).
     */
    public Product(int quantity, double price, double discount) {
        if (quantity <= 0 || price <= 0 || discount < 0) {
            throw new IllegalArgumentException("Параметры должны быть больше нуля.");
        }
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Метод для расчета и вывода общей суммы покупки без скидки
     * и со скидкой.
     */
    public void calculateTotal() {
        double totalWithoutDiscount = quantity * price;
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100);

        // Округляем до 2 знаков после запятой
        totalWithoutDiscount = Math.round(totalWithoutDiscount * 100.0) / 100.0;
        totalWithDiscount = Math.round(totalWithDiscount * 100.0) / 100.0;

        System.out.println("Общая сумма без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма со скидкой: " + totalWithDiscount);
    }
}