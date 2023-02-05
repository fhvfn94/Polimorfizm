package transport;

public class BigCar extends Transport implements Compliting {

    public BigCar(String mark, String model, double capacity) {
        super(mark, model, capacity);
    }


    @Override
    public void getPitStop() {
        System.out.println("pit stop Big Car");
    }

    @Override
    public void getBestTime() {
        System.out.println("10 time Big Car");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("100 km/h Big car");
    }
}
