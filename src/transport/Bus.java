package transport;

public class Bus extends Transport implements Compliting {
    public Bus(String mark, String model, double capacity) {
        super(mark, model, capacity);
    }

    @Override
    public void getPitStop() {
        System.out.println("pit stop Bus");
    }

    @Override
    public void getBestTime() {
        System.out.println("12 seconds Bus");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("150 km/h bus");
    }
}
