package Command;

public class CommandExit implements Command {
    public CommandExit(){

    }
    @Override
    public void execute(){
        System.out.println("Программа устала и ушла спать");
        System.exit(0); // 0 - указывает, что программа заканчивается правильно
    }
    @Override
    public String getDescription(){
        return "Завершает работу программы";
    }
}
