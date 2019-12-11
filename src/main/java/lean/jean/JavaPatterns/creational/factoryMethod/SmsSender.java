package lean.jean.JavaPatterns.creational.factoryMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsSender implements Sender {
    @Override
    public void send(String message) {
        log.info(message);
    }
}
