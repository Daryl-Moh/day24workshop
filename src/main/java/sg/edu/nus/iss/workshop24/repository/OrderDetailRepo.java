package sg.edu.nus.iss.workshop24.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.workshop24.models.Order;
import sg.edu.nus.iss.workshop24.models.OrderDetails;
import sg.edu.nus.iss.workshop24.repository.Queries.*;

@Repository
public class OrderDetailRepo {
    @Autowired
    private JdbcTemplate template;

    public void addOrderDetails(Order ord) {
        
    }

    public void addOrderDetails(List<OrderDetails> orderDetails, String id) {
        List<Object[]> arrData = orderDetails.stream()
            .map(li -> { 
                    Object[] l = new Object[6];
                    l[0] = li.getProduct();
                    l[1] = li.getUnitPrice();
                    l[2] = li.getDiscount();
                    l[3] = li.getQuantity();
                    l[4] = li.getOrder_id();
                    return l;
            }).toList();
            
            template.batchUpdate(SQL_INSERT_ORDER_DETAILS_TABLE, arrData);
    }

}
