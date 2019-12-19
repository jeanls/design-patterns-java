package lean.jean.JavaPatterns.structural.decorator;

import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Emitter;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {

    @Test
    public void test(){
        Emitter emitterSec = new EmitterDecoratorSec(new EmitterBasic());
        assertTrue(emitterSec.send("ola"));

    }
}