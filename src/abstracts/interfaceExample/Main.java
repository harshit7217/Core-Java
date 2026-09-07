package abstracts.interfaceExample;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(2.2);
        Shape s2 = new Rectangle(2,3);

        System.out.println("Circle Area: "+ s1.calculatedArea());
        System.out.println("Rectangle Area: "+ s2.calculatedArea());
    }
}