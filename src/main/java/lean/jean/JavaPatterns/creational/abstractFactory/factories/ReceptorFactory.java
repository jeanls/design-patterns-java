package lean.jean.JavaPatterns.creational.abstractFactory.factories;

import lean.jean.JavaPatterns.creational.abstractFactory.MasterCardReceptor;
import lean.jean.JavaPatterns.creational.abstractFactory.VisaReceptor;
import lean.jean.JavaPatterns.creational.abstractFactory.enums.Brand;
import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Receptor;

public class ReceptorFactory {

    public static Receptor create(Brand brand) {
        if (brand == Brand.VISA) {
            return new VisaReceptor();
        } else if (brand == Brand.MASTER) {
            return new MasterCardReceptor();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
