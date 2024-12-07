public class Main {
    public static void main(String[] args) {
        // Создание объектов и вызов метода calculateTotal()

        // 1. Скидка 0.75%
        Product product1 = new Product(10, 150.50, 0.75);
        System.out.println("Товар 1:");
        product1.calculateTotal();

        System.out.println();

        // 2. Скидка 42.575%
        Product product2 = new Product(5, 200.75, 42.575);
        System.out.println("Товар 2:");
        product2.calculateTotal();

        System.out.println();

        // 3. Скидка 59.1%
        Product product3 = new Product(3, 500.00, 59.1);
        System.out.println("Товар 3:");
        product3.calculateTotal();
    }
}