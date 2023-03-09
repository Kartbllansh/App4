package Command;
public class InfoCommand implements Command{
    @Override
    public void execute() {

    }
    @Override
    public String getDescription(){
        return "Команда выводит в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }
}
