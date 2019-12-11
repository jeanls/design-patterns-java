package lean.jean.JavaPatterns.creational.abstractFactory.interfaces;

public interface CommunicatorFactory {
    Emitter createEmitter();
    Receptor createReceptor();
}
