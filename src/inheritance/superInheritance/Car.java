package inheritance.superInheritance;

public class Car extends Vehicle{

    Car() {
        super();
        System.out.println("Car constructor");
    }

    public boolean isTrue() {
        boolean parentResult = super.isTrue();

        return !parentResult;
    }

    int maxSpeed = 120;

    void message() {
        System.out.println("Vehicle is Car");
    }

    void display(){


//        Methods
        this.message();
        super.message();

//        Variable
        System.out.println(this.maxSpeed);
        System.out.println(super.maxspeed);
    }
}
