package Animals;

import java.util.Arrays;

public class Dog extends Pet implements Trained {
    public static final String COMMAND_SIT = "Сидеть";
    public static final String COMMAND_VOICE = "Голос";
    public static final String COMMAND_FETH = "Апорт";

    public static final String[] ALL_TRAINED_COMMANDS = {COMMAND_SIT, COMMAND_VOICE, COMMAND_FETH};

    private String[] trainedCommands = new String[0];

    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Насыпают собачий корм в миску");
        System.out.println("Дают команду");
        System.out.println("Ем корм");
        System.out.println("Пью воду");
    }

    @Override
    public String toString() {
        return "Dog Name " + getName();
    }

    @Override
    public String[] getTrainedCommands() {
        return trainedCommands;
    }

    @Override
    public String[] getAllCommands() {
        return ALL_TRAINED_COMMANDS;
    }

    @Override
    public void train(String command) {
        trainedCommands = Arrays.copyOf(trainedCommands, trainedCommands.length + 1);
        trainedCommands[trainedCommands.length - 1] = command;

    }

    @Override
    public void doCommand(String command) {
        System.out.println("Выполняю комманду " + command);

        switch (command) {
            case COMMAND_SIT:
                System.out.println("Выполняю комманду сидеть");
                System.out.println("Собака садится на пол");
                break;
            case COMMAND_FETH:
                System.out.println("Собака побеежала за палкой");
                System.out.println("Собака принесла палку");
                break;
            case COMMAND_VOICE:
                talk();
                break;
            default:
                System.out.println("Нет такой комманды");
        }

    }
}
