package lean.jean.JavaPatterns.creational.builder.interfaces;

import java.time.LocalDate;

public interface BilletBuilder {
    void emitter(String emitter);
    void receptor(String receptor);
    void value(double value);
    void expDate(LocalDate expDate);
    void customNumber(int customNumber);
    Billet build();
}
