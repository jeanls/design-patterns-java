package lean.jean.JavaPatterns.behavioral.command;

import lean.jean.JavaPatterns.behavioral.command.interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandList {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        this.commands.add(command);
    }

    public void execute(){
        for(Command command : commands){
            command.execute();
        }
    }
}
