package sg.edu.nus.iss.workshop24.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private Date orderDate;
    private String customerName;
    private String shippingAddress;
    private String notes;
    private BigDecimal tax;
    private List<OrderDetails> orderDetails;
    
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public BigDecimal getTax() {
        return tax;
    }
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }
    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }
    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
    
    

}
