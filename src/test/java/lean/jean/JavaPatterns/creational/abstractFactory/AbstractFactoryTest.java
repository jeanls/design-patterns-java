package lean.jean.JavaPatterns.creational.abstractFactory;

import lean.jean.JavaPatterns.creational.abstractFactory.factories.VisaCommunicatorFactory;
import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.CommunicatorFactory;
import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryTest {

    @Test
    public void test() {
        CommunicatorFactory communicatorFactory = new VisaCommunicatorFactory();
        Emitter visaEmitter = communicatorFactory.createEmitter();
        assertTrue(visaEmitter.send(""));
    }
}