package lean.jean.JavaPatterns.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Observable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class NewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
