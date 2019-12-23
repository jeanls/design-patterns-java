package lean.jean.JavaPatterns.structural.flyWeight;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyWeightTest {

    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide(ThemeFlyWeightFactory.getTheme(ThemeFlyWeightFactory.THEME1), "", ""));
        assertEquals(1, presentation.getSlides().size());
    }

}