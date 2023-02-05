package transport;

public class Car extends Transport implements Compliting {

    public Car(String mark, String model, double capacity) {
        super(mark, model, capacity);
    }

    @Override
    public void getPitStop() {
        System.out.println("pit stop Car");
    }

    @Override
    public void getBestTime() {
        System.out.println("2 seconds Car");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("300 km/h Car");
    }
}
