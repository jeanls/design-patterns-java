package lean.jean.JavaPatterns.creational.multiton;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultitonTest {

    @Test
    public void test() {
        Theme themeFire = Theme.getInstance(Theme.FIRE);
        Theme themeSky = Theme.getInstance(Theme.SKY);
        assertEquals(Theme.FIRE, themeFire.getName());
        assertEquals(Theme.SKY, themeSky.getName());
    }
}