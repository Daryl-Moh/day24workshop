package sg.edu.nus.iss.workshop24.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Queries {

    public static final String SQL_INSERT_ORDERS_TABLE = """
            insert into orders(order_id, order_date, customer_name, ship_address, notes, tax)
            values (?, ?, ?, ?, ?, ?)
            """;

    public static final String SQL_INSERT_ORDER_DETAILS_TABLE = """
            insert into orders(product, unit_price, discount, quantity, order_id)
            values (?, ?, ?, ?, ?)
            """;        
}
