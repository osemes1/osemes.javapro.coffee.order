package osemes.javapro.coffee.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private static final Logger logger = LogManager.getLogger(CoffeeOrderBoard.class);

    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void add(Order order) {
        order.setOrderNumber(nextOrderNumber);
        orders.add(order);
        logger.info("Added order: {} | {}", order.getOrderNumber(), order.getCustomerName());
        nextOrderNumber++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.get(0);
            logger.info("Delivering order: {} | {}", nextOrder.getOrderNumber(), nextOrder.getCustomerName());
            orders.remove(0);
        } else {
            logger.info("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                Order deliveredOrder = orders.get(i);
                logger.info("Delivering order: {} | {}", deliveredOrder.getOrderNumber(), deliveredOrder.getCustomerName());
                orders.remove(i);
                return;
            }
        }
        logger.info("Order with number {} not found.", orderNumber);
    }

    public void draw() {
        logger.info("================");
        logger.info("Num | Name");
        for (Order order : orders) {
            logger.info("{} | {}", order.getOrderNumber(), order.getCustomerName());
        }
        logger.info("================");
    }
}
