package inheritance.multiple;

public class AmphiousVehicle implements LandVehicle, WaterVehicle{
    AmphiousVehicle() {
        System.out.println("This is AmphibiousVehicle");
    }
}
