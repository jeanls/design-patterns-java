package lean.jean.JavaPatterns.structural.decorator;

import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmitterBasic implements Emitter {
    @Override
    public boolean send(String message) {
        log.info(message);
        return true;
    }
}
