package lean.jean.JavaPatterns.structural.bridge.interfaces;

import java.io.FileNotFoundException;

public interface Document {
    void createFile() throws FileNotFoundException;
}
