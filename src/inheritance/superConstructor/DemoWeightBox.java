package inheritance.superConstructor;

public class DemoWeightBox {
    public static void main(String[] args) {
        var myBox1 = new BoxWeight(10, 26);

        System.out.println("Volume of myBox1: "+ myBox1.volume());
        System.out.println("Weight of myBox1: "+ myBox1.getWeight());

        var myBox2 = new BoxWeight(myBox1);

        System.out.println("Volume of myBox2: "+ myBox2.volume());
        System.out.println("Weight of myBox2: "+ myBox2.getWeight());
    }
}
