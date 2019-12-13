package lean.jean.JavaPatterns.structural.composite;

import lean.jean.JavaPatterns.structural.composite.interfaces.Excerpt;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j
public class ExcerptFoot implements Excerpt {
    private String direction;
    private double distance;

    @Override
    public void printPath() {
        log.info(toString());
    }
}
