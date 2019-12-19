package lean.jean.JavaPatterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Order {
    private Product product;
    private Client client;
    private String address;
}
