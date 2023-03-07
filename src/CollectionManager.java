import Base.Dragon;

import java.time.LocalDate;
import java.util.LinkedList;

public class CollectionManager {
    private LinkedList<Dragon> baseList =new LinkedList<>();


    public void makeBase(LinkedList<Dragon> list){
        this.baseList = list;
    }
    public void getInfo(){
        System.out.println("Коллекция");
    }

}
