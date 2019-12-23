package lean.jean.JavaPatterns.behavioral.command;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void test(){
        Player player = new Player(0);
        CommandList commandList = new CommandList();
        commandList.add(new PlayMusicCommand(player, "test.mp3"));
        commandList.add(new IncreaseVolumeCommand(player, 10));
        commandList.add(new DecreaseVolumeCommand(player, 5));
        commandList.execute();
        assertEquals(player.getVolume(), 5);
    }
}