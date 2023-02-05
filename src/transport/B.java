package transport;

public class B<T extends Car> extends Driver {

    public B(String name, boolean document, int age) {
        super(name, document, age);
    }

    @Override
    public String start() {
        return "Car started";
    }

    @Override
    public String stop() {
        return "Car stopped";
    }

    @Override
    String refuel() {
        return "Car refuel";
    }
    public String getCarMessage(Car car) {
        return "Водитель " + getName() + " водит машину " + car.getMark() + " " + car.getModel() + "и будет учавствовать в заезде ";
    }
}
