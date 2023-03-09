package Command;

public class CommandShow implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Команда выводит в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
