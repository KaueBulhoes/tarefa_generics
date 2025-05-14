public class SportsCar extends Car {
    
    public SportsCar(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        System.out.println("The sports car " + getModel() + " is speeding on the road!");
    }

    @Override
    public void stop() {
        System.out.println("The sports car " + getModel() + " has stopped.");
    }
}
