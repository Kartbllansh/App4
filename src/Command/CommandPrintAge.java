package Command;

public class CommandPrintAge implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Команда выводит значения поля age всех элементов в порядке возрастания";
    }
}
