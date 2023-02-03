package transport;

public class BigCar extends Transport implements Compliting {
    private static final String a = "Car";
    private static final double time = 10.5;
    private static final int speed = 100;
    public BigCar(String mark, String model, double capacity) {
        super(mark, model, capacity);
    }

    @Override
    public String getPitStop() {
        return a;
    }

    @Override
    public double getBestTime() {
        return time;
    }

    @Override
    public int getMaxSpeed() {
        return speed;
    }
}
