package lean.jean.JavaPatterns.behavioral.observer;

import lombok.Getter;

import java.util.Observable;
import java.util.Observer;

@Getter
public class NewsChannel implements Observer {
    private String news;

    @Override
    public void update(Observable observable, Object o) {
        this.news = (String) o;
    }
}
