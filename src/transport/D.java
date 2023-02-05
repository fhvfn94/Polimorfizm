package transport;

public class D<T extends Bus> extends Driver {
    public D(String name, boolean document, int age) {
        super(name, document, age);
    }

    @Override
    String start() {
        return "Bus started";
    }

    @Override
    String stop() {
        return "Bus stopped";
    }

    @Override
    String refuel() {
        return "Bus refuel";
    }

    public String getBus(Bus bus) {
        return "Водитель " + getName() + " водит машину " + bus.getMark() + " " + bus.getModel() + "и будет учавствовать в заезде ";
    }
}
