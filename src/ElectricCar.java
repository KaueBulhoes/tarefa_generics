public class ElectricCar extends Car {

    public ElectricCar(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        System.out.println("The electric car " + getModel() + " is driving silently.");
    }

    @Override
    public void stop() {
        System.out.println("The electric car " + getModel() + " has stopped.");
    }
}
