import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        
        cars.add(new SportsCar("Ferrari F8", 2022));
        cars.add(new ElectricCar("Tesla Model 3", 2021));

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel() + ", Year: " + car.getYear());
            car.drive();
            car.stop();
            System.out.println();
        }
    }
}
