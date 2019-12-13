package lean.jean.JavaPatterns.structural.composite;

import lean.jean.JavaPatterns.structural.composite.interfaces.Excerpt;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeTest {
    @Test
    public void test() {
        Excerpt excerpt1 = new ExcerptFoot("Av das nações unidas", 3.4);
        Excerpt excerpt2 = new ExcerptCar("Marginal pinheiros", 5.2);
        Excerpt excerpt3 = new ExcerptCar("Av Faria Lima", 1.1);
        Path path = new Path();
        path.add(excerpt1);
        path.add(excerpt2);
        path.add(excerpt3);
        path.printPath();
        assertEquals(3, path.getExcerpts().size());
    }
}