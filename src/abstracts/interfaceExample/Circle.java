package abstracts.interfaceExample;

public class Circle implements Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculatedArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
