package lean.jean.JavaPatterns.creational.abstractFactory.factories;

import lean.jean.JavaPatterns.creational.abstractFactory.VisaEmitter;
import lean.jean.JavaPatterns.creational.abstractFactory.enums.Brand;
import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.CommunicatorFactory;
import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;
import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Receptor;

public class VisaCommunicatorFactory implements CommunicatorFactory {
    @Override
    public Emitter createEmitter() {
        return EmitterFactory.create(Brand.MASTER);
    }

    @Override
    public Receptor createReceptor() {
        return ReceptorFactory.create(Brand.MASTER);
    }
}
