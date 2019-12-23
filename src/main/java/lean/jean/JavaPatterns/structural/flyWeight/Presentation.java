package lean.jean.JavaPatterns.structural.flyWeight;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@ToString
@Slf4j
@Getter
public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide){
        this.slides.add(slide);
    }

    public void print(){
        log.info(toString());
    }
}
