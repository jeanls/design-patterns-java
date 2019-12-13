package lean.jean.JavaPatterns.creational.prototype;

import lean.jean.JavaPatterns.creational.prototype.interfaces.Prototype;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Campaign implements Prototype<Campaign> {
    private String title;
    private String description;
    private Set<String> keywords;

    @Override
    public Campaign clone() {
        return new Campaign(title, description, keywords);
    }
}
