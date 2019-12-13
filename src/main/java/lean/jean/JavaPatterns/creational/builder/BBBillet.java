package lean.jean.JavaPatterns.creational.builder;

import lean.jean.JavaPatterns.creational.builder.interfaces.Billet;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@AllArgsConstructor
public class BBBillet implements Billet {
    private String emitter;
    private String receptor;
    private double value;
    private LocalDate expDate;
    private int customNumber;

    @Override
    public String getEmitter() {
        return emitter;
    }

    @Override
    public String getReceptor() {
        return receptor;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public LocalDate expDate() {
        return expDate;
    }

    @Override
    public int customNumber() {
        return customNumber;
    }
}
