package lean.jean.JavaPatterns.creational.singleton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Configuration {
    private String host;
    private int port;
    private static Configuration instance;

    public static Configuration getInstance(){
        if(Configuration.instance == null){
            Configuration.instance = new Configuration("host", 8080);
        }
        return Configuration.instance;
    }
}
