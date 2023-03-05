package Base;

public class Dragon {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer age; //Значение поля должно быть больше 0, Поле может быть null
    private Long weight; //Значение поля должно быть больше 0, Поле не может быть null
    private Color color; //Поле не может быть null
    private DragonType type; //Поле не может быть null
    private DragonHead head;
public Dragon (String name, Coordinates coordinates, Integer age, Long weight,Color color, DragonType type,DragonHead head) {
this.name = name;
    this.coordinates = coordinates;
    this.age = age;
    this.weight = weight;
    this.color = color;
    this.type = type;
    this.head = head;
}
    @Override
    public String toString(){
        return "StudyGroup{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", coordinates=" + coordinates
                + ", creationDate=" + creationDate
                + ", age=" + age
                + ", weight=" + weight
                + ", color=" + color
                + ", head=" + head
                + '}';
    }
}
