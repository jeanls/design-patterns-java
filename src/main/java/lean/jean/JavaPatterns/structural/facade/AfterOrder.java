package lean.jean.JavaPatterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class AfterOrder {
    private LocalDateTime localDateTime;

    public void scheduleContact(Client client, Product product) {
        log.info(client.toString());
        log.info(product.toString());
    }
}
