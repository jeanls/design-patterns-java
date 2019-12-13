package lean.jean.JavaPatterns.structural.composite;

import lean.jean.JavaPatterns.structural.composite.interfaces.Excerpt;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Path implements Excerpt {
    private List<Excerpt> excerpts;

    public Path() {
        excerpts = new ArrayList<>();
    }

    @Override
    public void printPath() {
        for (Excerpt excerpt : excerpts){
            excerpt.printPath();
        }
    }

    public void add(Excerpt excerpt) {
        excerpts.add(excerpt);
    }

    public void remove(Excerpt excerpt) {
        excerpts.remove(excerpt);
    }
}
