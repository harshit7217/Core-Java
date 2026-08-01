package introducingClasses.simpleClass;

public class DemoBox {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();

        myBox.height = 10;
        myBox.width = 20;
        myBox.depth = 15;

        myBox2.height = 3;
        myBox2.width = 6;
        myBox2.depth = 9;

//        double vol = myBox.depth * myBox.height * myBox.width;
//
//        System.out.println("Volume = "+ vol);
//
//        vol = myBox2.depth * myBox2.height * myBox2.width;
//
//        System.out.println("Volume = "+ vol);

//        Adding method in class
        myBox.volume();
        myBox2.volume();
    }
}
