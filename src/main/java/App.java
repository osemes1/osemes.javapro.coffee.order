
package osemes.javapro.coffee.order;

public class App {
    public static void main(String[] args) {
        // Створюємо нову дошку замовлень
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        // Додаємо замовлення
        Order order1 = new Order("Alen");
        orderBoard.add(order1);

        Order order2 = new Order("Yoda");
        orderBoard.add(order2);

        Order order3 = new Order("Obi-van");
        orderBoard.add(order3);

        Order order4 = new Order("John Snow");
        orderBoard.add(order4);

        // Виводимо поточний стан черги
        orderBoard.draw();

        // Видача замовлень
        orderBoard.deliver();
        orderBoard.deliver();

        // Виводимо оновлений стан черги
        orderBoard.draw();

        // Видача замовлення за певним номером
        orderBoard.deliver(33);

        // Виводимо оновлений стан черги
        orderBoard.draw();
    }
}
