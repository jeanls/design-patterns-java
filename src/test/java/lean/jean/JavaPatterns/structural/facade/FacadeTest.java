package lean.jean.JavaPatterns.structural.facade;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FacadeTest {

    @Test
    public void test() {
        Stock stock = new Stock();
        Finance finance = new Finance();
        AfterOrder afterOrder = new AfterOrder(LocalDateTime.now());
        OrderFacade orderFacade = new OrderFacade(stock, finance, afterOrder);
        Order order = new Order(new Product("Product 1"), new Client("Client 1"), "Av 1");
        assertTrue(orderFacade.registerOrder(order));
    }
}