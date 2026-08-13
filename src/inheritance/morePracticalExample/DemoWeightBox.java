package inheritance.morePracticalExample;

public class DemoWeightBox {
    public static void main(String[] args) {
        var myBox1 = new BoxWeight(10, 20, 30, 40);
        var myBox2 = new BoxWeight(1,2,3,4);

        System.out.println("Volume of myBox1: "+ myBox1.volume());
        System.out.println("Weight of myBox1: "+ myBox1.weight);

        System.out.println();

        System.out.println("Volume of myBox2: "+ myBox2.volume());
        System.out.println("Weight of myBox2: "+ myBox2.weight);
    }
}
