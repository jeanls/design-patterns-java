package lean.jean.JavaPatterns.creational.abstractFactory.enums;

import lombok.Getter;

@Getter
public enum Brand {
    VISA(1), MASTER(2);

    private int value;

    Brand(int value) {
        this.value = value;
    }
}
