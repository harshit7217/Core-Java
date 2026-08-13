package inheritance.morePracticalExample;

public class DemoColourBox {
    public static void main(String[] args) {
        var myBox1 = new ColourBox(10, 15, 25, "Red");

        System.out.println("Volume of myBox1: "+ myBox1.volume());
        System.out.println("Colour of myBox1: "+ myBox1.colour);
    }
}
