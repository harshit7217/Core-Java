package aCloserLookAtMethodsAndClasses.usingObjectAsParameters;

public class OverloadedConstructor2 {
    public static void main(String[] args) {
//        created boxes using the various constructor
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(20);

        Box myClone = new Box(myBox1);

        double vol;

//        get the volume of the first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox1: "+ vol);

//        get the volume of the second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox2: "+ vol);

//        get the volume of the cube box
        vol = myCube.volume();
        System.out.println("Volume of mycube: "+ vol);

//        get the volume of the clone box
        vol = myClone.volume();
        System.out.println("Volume of myClone: "+ vol);

    }
}
