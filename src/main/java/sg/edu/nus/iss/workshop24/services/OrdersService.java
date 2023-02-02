package sg.edu.nus.iss.workshop24.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.workshop24.exception.OrdersException;
import sg.edu.nus.iss.workshop24.models.Order;
import sg.edu.nus.iss.workshop24.repository.OrderDetailRepo;
import sg.edu.nus.iss.workshop24.repository.OrdersRepo;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepo ordsRepo;
    
    @Autowired
    private OrderDetailRepo ordDetRepo;
 
    @Transactional(rollbackFor = OrdersException.class)
    public void createOrders(Order ord){
        String orderId = UUID.randomUUID().toString().substring(0, 8);
        ord.setOrderId(orderId);
        ordsRepo.insertOrder(ord);
        // check order > 5 throw exception
        ordDetRepo.addOrderDetails(ord.getOrderDetails(), orderId);
    }
}
