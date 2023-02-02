package transport;

public class Car extends Transport implements Methods {

    public Car(String mark, String model, double capacity) {
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
