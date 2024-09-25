package OrderDataToJson;

public class Order {
    private String orderSn;
    private String subject;
    private Integer quantity;

    public Order(){

    }

    public Order(String orderSn, String subject, Integer quantity) {
        this.orderSn = orderSn;
        this.subject = subject;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderSn='" + orderSn + '\'' +
                ", subject='" + subject + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
