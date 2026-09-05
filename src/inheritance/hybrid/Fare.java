package inheritance.hybrid;

public interface Fare {
    default void fareInfo() {
        System.out.println("Fare Information");
    }
}
