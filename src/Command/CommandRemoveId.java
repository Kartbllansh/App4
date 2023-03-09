package Command;

public class CommandRemoveId implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Команда удаляет элемент, находящийся в заданной позиции коллекции (index)";
    }
}
