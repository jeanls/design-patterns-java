package lean.jean.JavaPatterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void test(){
        Configuration configuration = Configuration.getInstance();
        assertEquals(configuration.getPort(), 8080);
    }
}