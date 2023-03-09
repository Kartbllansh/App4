package Command;

public class CommandRemoveType implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Команда удаляет из коллекции один элемент, значение поля type которого эквивалентно заданному";
    }
}
