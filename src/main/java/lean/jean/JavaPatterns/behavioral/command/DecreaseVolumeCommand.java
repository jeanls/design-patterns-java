package lean.jean.JavaPatterns.behavioral.command;

import lean.jean.JavaPatterns.behavioral.command.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DecreaseVolumeCommand implements Command {
    private Player player;
    private int level;

    @Override
    public void execute() {
        this.player.decreaseVolume(level);
    }
}
