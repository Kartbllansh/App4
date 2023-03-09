package Command;

public class CommandAddMin implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Команда добавляет новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }
}
