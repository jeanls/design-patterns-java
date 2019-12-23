package lean.jean.JavaPatterns.structural.flyWeight;

import lean.jean.JavaPatterns.structural.flyWeight.interfaces.ThemeFlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ThemeFlyWeightFactory {
    private static Map<Class<? extends ThemeFlyWeight>, ThemeFlyWeight> themes = new HashMap<>();
    public static final Class<Theme1> THEME1 = Theme1.class;
    public static final Class<Theme2> THEME2 = Theme2.class;
    public static final Class<Theme3> THEME3 = Theme3.class;

    public static ThemeFlyWeight getTheme(Class<? extends ThemeFlyWeight> clazz) throws IllegalAccessException, InstantiationException {
        if(!themes.containsKey(clazz)){
            themes.put(clazz, clazz.newInstance());
        }
        return themes.get(clazz);
    }
}
