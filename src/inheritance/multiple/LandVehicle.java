package inheritance.multiple;

public interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}
