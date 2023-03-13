package Base;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Dragon {

    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    transient private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer age; //Значение поля должно быть больше 0, Поле может быть null
    private Long weight; //Значение поля должно быть больше 0, Поле не может быть null
    private Color color; //Поле не может быть null
    private DragonType type; //Поле не может быть null
    private DragonHead head;
public Dragon (Long id, String name, Coordinates coordinates, ZonedDateTime creationDate, Integer age, Long weight, Color color, DragonType type, DragonHead head) {
    this.id = id;
    this.name = name;
    this.creationDate = ZonedDateTime.now();
    this.coordinates = coordinates;
    this.setAge(age);
    this.setWeight(weight);
    this.color = color;
    this.type =type;
    this.setHead(head);
}

    public Dragon(String name) {
    this.name = name;
    }

    @Override
    public String toString(){
        return "Dragon{"
                + "id =" + getId()
                + ", name =" + getName()
                + ", coordinates =" + getCoordinates()
                + ", creationDate =" + ZonedDateTime.now()
                + ", age =" + getAge()
                + ", weight =" + getWeight()
                + ", color =" + getColor()
                + ", head =" + getHead()
                + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public java.time.ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.time.ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public DragonType getType() {
        return type;
    }

    public void setType(DragonType type) {
        this.type = type;
    }

    public DragonHead getHead() {
        return head;
    }

    public void setHead(DragonHead head) {
        this.head = head;
    }
    //public Long addId(){
       // return (long) (Math.random() * 1000 + 1);
    //}
}
