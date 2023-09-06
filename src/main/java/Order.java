package osemes.javapro.coffee.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Order {
    private static final Logger logger = LogManager.getLogger(Order.class);

    private int orderNumber;
    private String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
        logger.info("Created order for customer: {}", customerName);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
