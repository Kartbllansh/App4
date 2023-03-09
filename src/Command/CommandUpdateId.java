package Command;

public class CommandUpdateId implements Command {

    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Команда обновляет значение элемента коллекции, id которого равен заданному";
    }
}
