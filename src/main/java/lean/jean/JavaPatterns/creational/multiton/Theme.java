package lean.jean.JavaPatterns.creational.multiton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class Theme {
    private String name;
    private Color foregroundColor;
    private Color backgroundColor;

    private static Map<String, Theme> themeMap = new HashMap<>();
    public static final String SKY = "SKY";
    public static final String FIRE = "FIRE";

    private Theme(){

    }

    static {
        themeMap.put(Theme.SKY, new Theme(Theme.SKY, Color.blue, Color.BLACK));
        themeMap.put(Theme.FIRE, new Theme(Theme.FIRE, Color.orange, Color.yellow));
    }

    public static Theme getInstance(String name){
        return Theme.themeMap.get(name);
    }
}
