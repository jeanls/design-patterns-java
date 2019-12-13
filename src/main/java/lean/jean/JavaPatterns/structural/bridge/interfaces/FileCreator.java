package lean.jean.JavaPatterns.structural.bridge.interfaces;

import java.io.FileNotFoundException;

public interface FileCreator {
    void create(String content) throws FileNotFoundException;
}
