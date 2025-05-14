public abstract class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract void drive();
    public abstract void stop();

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
