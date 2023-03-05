package Command;

public interface Command {
    void execute();

    default String getDescription(){ //метод по умолчанию
        return "Описания у этой команды нет"
    }


}
