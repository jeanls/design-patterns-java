package lean.jean.JavaPatterns.structural.flyWeight;

import lean.jean.JavaPatterns.structural.flyWeight.interfaces.ThemeFlyWeight;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Slide {
    private ThemeFlyWeight themeFlyWeight;
    private String title;
    private String text;

    public void print(){
        this.themeFlyWeight.print(title, text);
    }
}
