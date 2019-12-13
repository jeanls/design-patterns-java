package lean.jean.JavaPatterns.creational.builder;

import lean.jean.JavaPatterns.creational.builder.interfaces.Billet;
import lean.jean.JavaPatterns.creational.builder.interfaces.BilletBuilder;

import java.time.LocalDate;

public class BilletCreator {
    private BilletBuilder billetBuilder;


    public BilletCreator(BilletBuilder billetBuilder) {
        this.billetBuilder = billetBuilder;
    }

    public Billet build() {
        this.billetBuilder.emitter("Emitter");
        this.billetBuilder.receptor("Receptor");
        this.billetBuilder.customNumber(1);
        this.billetBuilder.expDate(LocalDate.now());
        this.billetBuilder.value(10);
        return this.billetBuilder.build();
    }
}
