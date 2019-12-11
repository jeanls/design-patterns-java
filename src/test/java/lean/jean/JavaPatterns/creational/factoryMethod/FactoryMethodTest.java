package lean.jean.JavaPatterns.creational.factoryMethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMethodTest {

    @Test
    public void create() {
        EmailSender emailSender = (EmailSender) SenderFactory.create(1);
    }
}