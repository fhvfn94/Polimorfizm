package transport;

public class C<T extends BigCar> extends Driver {
    public C(String name, boolean document, int age) {
        super(name, document, age);
    }

    @Override
    String start() {
        return "Big Car started";
    }

    @Override
    String stop() {
        return "Big Car stopped";
    }

    @Override
    String refuel() {
        return "Big Car refuel";
    }
    public String getBigCar(BigCar bigCar) {
        return "Водитель " + getName() + " водит машину " + bigCar.getMark() + " " + bigCar.getModel() + "и будет учавствовать в заезде ";
    }
}
