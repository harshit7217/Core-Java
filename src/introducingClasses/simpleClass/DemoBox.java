package introducingClasses.simpleClass;

public class DemoBox {
    public static void main(String[] args) {
        Box myBox = new Box();

        myBox.height = 10;
        myBox.width = 20;
        myBox.depth = 15;

        double vol = myBox.depth * myBox.height * myBox.width;

        System.out.println("Volume = "+ vol);
    }
}
