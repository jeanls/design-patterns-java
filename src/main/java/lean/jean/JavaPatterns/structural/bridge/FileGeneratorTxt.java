package lean.jean.JavaPatterns.structural.bridge;

import lean.jean.JavaPatterns.structural.bridge.interfaces.FileCreator;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileGeneratorTxt implements FileCreator {
    @Override
    public void create(String content) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("receipt.txt");
        printStream.println(content);
        printStream.close();
    }
}
