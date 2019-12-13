package lean.jean.JavaPatterns.structural.bridge;

import lean.jean.JavaPatterns.structural.bridge.interfaces.FileCreator;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class BridgeTest {

    @Test
    public void test() throws FileNotFoundException {
        FileCreator fileCreator = new FileGeneratorTxt();
        Receipt receipt = new Receipt("Jean", "Java", 10, fileCreator);
        receipt.createFile();
        assertTrue(new File("receipt.txt").exists());
    }
}