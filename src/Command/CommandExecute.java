package Command;

public class CommandExecute implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Команда считает и исполняет скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }
}
