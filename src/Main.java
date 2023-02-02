import Animals.Cat.Breed;
import Animals.*;

public class Main {

    public static void main(String[] args) {
//        Breed brShHair = new Breed("British Shorthair", "GB", "short");

//        Cat murzik = new Cat("Мурзик", 3);
//        Pet murzik = new Cat("Мурзик", 3);
//        murzik.setBreed(brShHair);
//        murzik.eat();
//        murzik.talk();
//
//        Cat.FavToy murzikToy = murzik.new FavToy("Рыбка", "заводная");
//        murzik.setToy(murzikToy);

//        System.out.println("Игрушка " + murzikToy.getName() + ", нравится коту " + murzikToy.getCatName());

        Dog sharik = new Dog("Шарик", 2005);
        sharik.train(Dog.COMMAND_FETH);
        sharik.train(Dog.COMMAND_SIT);
//        Dog sharik2 = new Dog("Шарик", 2005);
//        sharik.eat();
//
//        System.out.println(sharik == sharik2); // !!! сравнение ссылок equals не будет вызван
//        System.out.println(sharik.equals(sharik2));
//        System.out.println(sharik.equals(sharik));
//
//        if (sharik.equals(sharik2)) {
//            sharik = sharik2;
//        }
//
//        Parrot kesha = new Parrot("Кеша");
//        kesha.eat();

//        Hamster hamster = new Hamster("Хомяк");
//        hamster.eat();
//
//
//        Cat begemot = new Cat("Бегемот", 5);
//
//        murzik.addFriends(sharik);
//        murzik.addFriends(begemot);
//        murzik.addFriends(kesha);
//        murzik.addFriends(hamster);

//        for (Pet friend : murzik.getFriends()) {
//            if (friend instanceof Cat) {
//                Cat cat = (Cat) friend;
//                cat.meow();
//            } else if (friend instanceof Parrot) {
//                ((Parrot) friend).talk();
//            } else if (friend.getClass() == Dog.class) {
//                ((Dog) friend).talk();
//            } else {
//                System.out.println(friend);
//            }
//        }
        Tiger tiger = new Tiger();
        checkTrained(sharik, tiger, new Dog("Ali"));

    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (String command : animal.getTrainedCommands()) {
                animal.doCommand(command);
            }
        }
    }
}