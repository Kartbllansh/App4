package Command;

import java.util.HashMap;

public class HelpCommand implements Command{
    private HashMap<String, Command> mapCommand;
    public HelpCommand(HashMap<String, Command> command ){
        this.mapCommand = command;
    }

    @Override
    public void execute() {

    }
    @Override
    public String getDescription(){
        return "Команда выводит  справку по доступным командам";
    }
}
