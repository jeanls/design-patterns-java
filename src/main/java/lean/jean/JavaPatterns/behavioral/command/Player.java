package lean.jean.JavaPatterns.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Getter
public class Player {
    private int volume;

    public void play(String fileName) throws InterruptedException {
        log.info("Playing " + fileName);
        long duration = (long) (Math.random() * 2000);
        log.info("End execution " + duration);
    }

    public void increaseVolume(int volume) {
        this.volume += volume;
    }

    public void decreaseVolume(int volume) {
        this.volume -= volume;
    }
}
