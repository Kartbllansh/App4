package Command;

public class CommandPrintType implements Command {
    @Override
    public void execute() {

    }

    @Override
    public String getDescription() {
        return "Командам выводит значения поля type всех элементов в порядке убывания";
    }
}
