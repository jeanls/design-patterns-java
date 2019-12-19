package lean.jean.JavaPatterns.structural.decorator;

import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;

public abstract class EmitterDecorator implements Emitter {
    private Emitter emitter;

    public EmitterDecorator(Emitter emitter) {
        this.emitter = emitter;
    }

    public abstract boolean send(String message);

    public Emitter getEmitter() {
        return emitter;
    }
}
