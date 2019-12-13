package lean.jean.JavaPatterns.structural.bridge;

import lean.jean.JavaPatterns.structural.bridge.interfaces.Document;
import lean.jean.JavaPatterns.structural.bridge.interfaces.FileCreator;
import lombok.*;

import java.io.FileNotFoundException;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Receipt implements Document {
    private String emitter;
    private String receptor;
    private double value;
    private FileCreator fileCreator;

    @Override
    public void createFile() throws FileNotFoundException {
        fileCreator.create(toString());
    }
}
