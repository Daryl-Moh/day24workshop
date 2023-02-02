package sg.edu.nus.iss.workshop24.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.workshop24.models.Order;
import sg.edu.nus.iss.workshop24.repository.Queries.*;

@Repository
public class OrdersRepo {

    @Autowired
    private JdbcTemplate template;

    public boolean insertOrder(Order order) {
        return template.update(SQL_INSERT_ORDERS_TABLE,
                    ord.getOrder_id(),
                    ord.getOrderDate(),
                    ord.getCustomerName(),
                    ord.getShippingAddress(),
                    ord.getNotes(),
                    ord.getTax() ) >0;
                    
    }
}
