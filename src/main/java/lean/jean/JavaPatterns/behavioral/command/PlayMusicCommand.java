package lean.jean.JavaPatterns.behavioral.command;

import lean.jean.JavaPatterns.behavioral.command.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlayMusicCommand implements Command {
    private Player player;
    private String fileName;

    @Override
    public void execute() {
        try {
            this.player.play(fileName);
        }catch (InterruptedException i){
            i.printStackTrace();
        }
    }
}
