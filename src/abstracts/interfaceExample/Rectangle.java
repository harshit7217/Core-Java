package abstracts.interfaceExample;

public class Rectangle implements Shape{

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatedArea() {
        return length * width;
    }

    public void message() {
        System.out.println("Hello");
    }
}
