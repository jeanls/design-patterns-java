package lean.jean.JavaPatterns.behavioral.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {

    @Test
    public void newsTest() {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel newsChannel = new NewsChannel();
        newsAgency.addObserver(newsChannel);
        newsAgency.setNews("hello world");
        assertEquals(newsAgency.getNews(), newsChannel.getNews());
    }
}