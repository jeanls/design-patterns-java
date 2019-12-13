package lean.jean.JavaPatterns.creational.builder.interfaces;

import java.time.LocalDate;

public interface Billet {
    String getEmitter();
    String getReceptor();
    double getValue();
    LocalDate expDate();
    int customNumber();
    String toString();
}
