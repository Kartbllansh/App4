package Base;

public class DragonHead {
    private Double size; //Поле не может быть null
    private Integer eyesCount; //Поле не может быть null
    private Long toothCount; //Поле может быть null

    public DragonHead(Double size, Integer eyesCount, Long toothCount) {
        this.eyesCount = eyesCount;
        this.size = size;
        this.toothCount = toothCount;
    }
    @Override
    public String toString(){
    return "DragonHead:" +
            "Eyes count =" + eyesCount +
            ", size =" + size+
            ", Tooth count =" + toothCount;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getEyesCount() {
        return eyesCount;
    }

    public void setEyesCount(Integer eyesCount) {
        this.eyesCount = eyesCount;
    }

    public Long getToothCount() {
        return toothCount;
    }

    public void setToothCount(Long toothCount) {
        this.toothCount = toothCount;
    }
}
