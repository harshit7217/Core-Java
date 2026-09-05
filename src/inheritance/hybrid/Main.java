package inheritance.hybrid;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleType();
        car.carType();

        Bus bus = new Bus();
        bus.vehicleType();
        bus.busType();
        bus.fareInfo();
    }
}
