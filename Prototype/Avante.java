package Prototype;

public class Avante implements Car{

    private int speed;

    public Avante(int speed){
        this.speed = speed;
    }

    @Override
    public Car clone() {
        return new Avante(this.speed);
    }

    @Override
    public int getMadSpeed() {
        return this.speed;
    }

    public boolean equals(Avante o){
        if(this.speed == o.speed){
            return true;
        }
        return false;
    }
}
