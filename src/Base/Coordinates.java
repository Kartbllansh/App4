package Base;

import java.util.Objects;

public class Coordinates {
    private Float x; //Значение поля должно быть больше -474, Поле не может быть null
    private float y;
public Coordinates(Float x, float y){
    this.setX(x);
    this.y = y;
}
@Override
public String toString(){
    return "Coordinates: " +
            "x="+x +
            ", y="+y;
}
    public Float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(Float x) {
        if ((x > -474) & (x!=0)) {
            this.x = x;
        } else if(x < -474){
            throw new IllegalArgumentException("Number x < -474. You can't do it this way");
        } else{
            throw new IllegalArgumentException("Number x = 0. You can't do it this way");
        }
    }

    public void setY(float y) {
        this.y = y;
    }
}
