package Base;

public class Coordinates {
    private Float x; //Значение поля должно быть больше -474, Поле не может быть null
    private float y;
public Coordinates(Float x, float y){
    this.x = x;
    this.y = y;
}
    public Float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
}
