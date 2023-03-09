import Base.Dragon;
import Base.DragonType;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionManager {
    private LinkedList<Dragon> baseList =new LinkedList<>();


    public void makeBase(LinkedList<Dragon> list){
        this.baseList = list;
    }
    public void getInfo(){
        System.out.println("Коллекция");
    }
     public void removeByType(DragonType type){

        for(int i=0; i<baseList.size(); i++){
           String a = String.valueOf(baseList.get(i));
            if(a.contains(type.toString())){
                baseList.remove(i);
            }
        }
     }
     public void clear(){
        baseList.clear();
     }
        public void removeById(int i){
        baseList.remove(i);
     }
     public void show(){
        for(int i=0; i<baseList.size(); i++){
            System.out.println("Элемент коллекции №"+i+" :"+baseList.get(i));
        }
     }

     public void printAscedingAge(){
        List<Integer> ages = new ArrayList<>();
        for(Dragon dragon : baseList){
             ages.add(dragon.getAge());
            Collections.sort(ages);
        }
    }
    public void printDescendingType() {
        List<DragonType> types = new ArrayList<>();
        for (Dragon dragon : baseList) {
            types.add(dragon.getType());
            //сортировка нужна
        }

    }

     public void updateId(Dragon change, int i){
      baseList.set(i, change);
     }
}
