import transport.*;
public class Main {
    public static void main(String[] args) {
        Car audi = new Car("audi", "A4", 2.5);
        Car bmw = new Car("bmw", "535", 3.5);
        Car toyota = new Car("toyota", "camry", 2.3);
        Car ford = new Car("ford", "mustang", 5.5);
        BigCar volvo = new BigCar("volvo", "fh", 12.8);
        BigCar mercedes = new BigCar("mercedes", "actros", 12.5);
        BigCar DAF = new BigCar("DAF", "dadada", 15.8);
        BigCar MAN = new BigCar("MAN", "manana", 11.8);
        Bus citroen = new Bus("citroen", "jumper", 2.2);
        Bus fiat = new Bus("fiat", "ducato", 2.3);
        Bus hyundai = new Bus("hyundai", "univerce", 11.2);
        Bus renault = new Bus("renault", "master", 2.5);
        audi.getFinished();
    }
}