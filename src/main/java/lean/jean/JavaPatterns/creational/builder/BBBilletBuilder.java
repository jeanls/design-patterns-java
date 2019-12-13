package lean.jean.JavaPatterns.creational.builder;

import lean.jean.JavaPatterns.creational.builder.interfaces.Billet;
import lean.jean.JavaPatterns.creational.builder.interfaces.BilletBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class BBBilletBuilder implements BilletBuilder {
    private String emitter;
    private String receptor;
    private double value;
    private LocalDate expDate;
    private int customNumber;

    @Override
    public void emitter(String emitter) {
        this.emitter = emitter;
    }

    @Override
    public void receptor(String receptor) {
        this.receptor = receptor;
    }

    @Override
    public void value(double value) {
        this.value = value;
    }

    @Override
    public void expDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    @Override
    public void customNumber(int customNumber) {
        this.customNumber = customNumber;
    }

    @Override
    public Billet build() {
        return new BBBillet(emitter, receptor, value, expDate, customNumber, "01000");
    }
}
