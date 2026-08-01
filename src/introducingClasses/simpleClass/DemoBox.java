package introducingClasses.simpleClass;

public class DemoBox {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();

//        myBox.height = 10;
//        myBox.width = 20;
//        myBox.depth = 15;
//
//        myBox2.height = 3;
//        myBox2.width = 6;
//        myBox2.depth = 9;

//        Setting the dimension of the box
        myBox.Dem(20, 10, 15);
        myBox2.Dem(3, 6, 9);

//        double vol = myBox.depth * myBox.height * myBox.width;
//
//        System.out.println("Volume = "+ vol);
//
//        vol = myBox2.depth * myBox2.height * myBox2.width;
//
//        System.out.println("Volume = "+ vol);

//        Adding method in class
        System.out.println("My Box volume = "+myBox.volume());
        System.out.println("My Box 2 volume = "+ myBox2.volume());
    }
}
