package lean.jean.JavaPatterns.structural.decorator;

import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmitterDecoratorSec extends EmitterDecorator {
    public EmitterDecoratorSec(Emitter emitter) {
        super(emitter);
    }

    @Override
    public boolean send(String message) {
        this.getEmitter().send(message + ":SEC");
        return true;
    }
}
