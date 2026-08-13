package aCloserLookAtMethodsAndClasses.inferenceAndReference;

public class Main {
    public static void main(String[] args) {
        var mc = new MyClass();

        mc.setI(10);

        System.out.println(mc.getI());
    }
}
