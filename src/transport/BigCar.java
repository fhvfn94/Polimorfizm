package transport;

public class BigCar extends Transport implements Methods {
    public BigCar(String mark, String model, double capacity) {
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
