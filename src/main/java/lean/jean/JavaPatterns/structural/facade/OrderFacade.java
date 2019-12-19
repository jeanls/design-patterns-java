package lean.jean.JavaPatterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class OrderFacade {
    private Stock stock;
    private Finance finance;
    private AfterOrder afterOrder;

    public boolean registerOrder(Order order){
        this.stock.sendProduct(order.getProduct(), order.getAddress());
        this.finance.invoice(order.getClient(), order.getProduct());
        this.afterOrder.scheduleContact(order.getClient(), order.getProduct());
        return true;
    }
}
