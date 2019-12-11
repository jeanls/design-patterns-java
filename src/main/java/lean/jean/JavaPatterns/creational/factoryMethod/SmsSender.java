package lean.jean.JavaPatterns.creational.factoryMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsSender implements Sender {
    @Override
    public boolean send(String message) {
        log.info(message);
        return true;
    }
}
