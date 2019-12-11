package lean.jean.JavaPatterns.creational.abstractFactory.factories;

import lean.jean.JavaPatterns.creational.abstractFactory.MasterCardEmitter;
import lean.jean.JavaPatterns.creational.abstractFactory.VisaEmitter;
import lean.jean.JavaPatterns.creational.abstractFactory.enums.Brand;
import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;

public class EmitterFactory {
    public static Emitter create(Brand brand) {
        if (brand == Brand.MASTER) {
            return new MasterCardEmitter();
        } else if (brand == Brand.VISA) {
            return new VisaEmitter();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
