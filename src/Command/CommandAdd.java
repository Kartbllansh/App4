package Command;

import File.CollectionManager;

public class CommandAdd implements Command {
    public CommandAdd(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }
    private final CollectionManager collectionManager;



    @Override
    public void execute() {
    }

    @Override
    public String getDescription() {
        return "Команда добавляет новый элемент в коллекцию";
    }
}
