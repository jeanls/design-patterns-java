package lean.jean.JavaPatterns.creational.abstractFactory;

import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;

public class VisaEmitter implements Emitter {
    @Override
    public boolean send() {
        return true;
    }
}
