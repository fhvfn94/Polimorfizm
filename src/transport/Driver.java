package transport;

public abstract class Driver {
    private String name;
    private boolean document;
    private int age;

    public Driver(String name, boolean document, int age) {
        this.name = name;
        this.document = document;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isDocument() {
        return document;
    }

    public int getAge() {
        return age;
    }

    abstract String start();

    abstract String stop();

    abstract String refuel();

}
