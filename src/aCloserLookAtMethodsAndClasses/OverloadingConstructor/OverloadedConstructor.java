package aCloserLookAtMethodsAndClasses.OverloadingConstructor;

public class OverloadedConstructor {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 50);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        double vol;

//        get volume of the first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is "+ vol);

//        get volume of the second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is "+ vol);

//        get volume of the third vox
        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is "+ vol);
    }
}
