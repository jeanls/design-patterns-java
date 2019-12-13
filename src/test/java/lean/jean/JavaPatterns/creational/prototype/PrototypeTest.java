package lean.jean.JavaPatterns.creational.prototype;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PrototypeTest {

    @Test
    public void test(){
        Set<String> set = new HashSet<>();
        set.add("keyword1");
        Campaign campaign = new Campaign("title", "description", set);
        Campaign clone = campaign.clone();
        assertEquals(campaign.getTitle(), clone.getTitle());
    }
}