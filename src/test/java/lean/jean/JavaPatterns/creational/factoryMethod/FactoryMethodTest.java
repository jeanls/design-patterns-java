package lean.jean.JavaPatterns.creational.factoryMethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMethodTest {

    @Test
    public void create() {
        Sender senderSms = SenderFactory.create(SenderFactory.SMS);
        Sender senderEmail = SenderFactory.create(SenderFactory.EMAIL);
        assertTrue(senderSms instanceof SmsSender);
        assertTrue(senderEmail instanceof EmailSender);
    }
}