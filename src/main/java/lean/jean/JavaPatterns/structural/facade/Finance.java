package lean.jean.JavaPatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Finance {
    public void invoice(Client client, Product product) {
        log.info(client.toString());
        log.info(product.toString());
    }
}
