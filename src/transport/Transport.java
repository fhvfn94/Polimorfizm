package transport;

public class Transport {
    private String mark;
    private String model;
    private double capacity;

    public Transport(String mark, String model, double capacity) {
        this.setMark(mark);
        this.setModel(model);
        this.setCapacity(capacity);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark != null && !mark.isEmpty() && !mark.isBlank()) {
            this.mark = mark;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        }
    }
}
