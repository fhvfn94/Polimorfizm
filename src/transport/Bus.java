package transport;

public class Bus extends Transport implements Methods {
    public Bus(String mark, String model, double capacity) {
        super(mark, model, capacity);
    }

    @Override
    public void getStarted() {
        System.out.println("начало поездки");
    }

    @Override
    public void getFinished() {
        System.out.println("конец поездки");
    }
}
