package lean.jean.JavaPatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stock {
    public boolean sendProduct(Product product, String address) {
        log.info(product.toString());
        log.info(address);
        return true;
    }
}
