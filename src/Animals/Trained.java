package Animals;

public interface Trained {
    //    Все методы в итерефейсе абстрактные и публичные
    String[] getTrainedCommands();
    String[] getAllCommands();

    void train(String command);
    void doCommand(String command);

}