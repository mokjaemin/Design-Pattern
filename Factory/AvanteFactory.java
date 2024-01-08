package Factory;

public class AvanteFactory implements CarFactory{

    @Override
    public Car produceCar() {
        return new Avante();
    }
}
