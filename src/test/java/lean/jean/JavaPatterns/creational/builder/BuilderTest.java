package lean.jean.JavaPatterns.creational.builder;

import lean.jean.JavaPatterns.creational.builder.interfaces.Billet;
import lean.jean.JavaPatterns.creational.builder.interfaces.BilletBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void test(){
        BilletBuilder billetBuilder = new BBBilletBuilder();
        BilletCreator billetCreator = new BilletCreator(billetBuilder);
        Billet billet = billetCreator.build();
        assertNotNull(billet.toString());
    }
}