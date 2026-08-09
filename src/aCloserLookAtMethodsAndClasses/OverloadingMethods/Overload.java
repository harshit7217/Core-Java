package aCloserLookAtMethodsAndClasses.OverloadingMethods;

public class Overload {
    public static void main(String[] args) {
        OverloadedDemo overloadedDemo = new OverloadedDemo();

//        call all the version of test(0
        overloadedDemo.test();
        overloadedDemo.test(10);
        overloadedDemo.test(10, 20);

        double result = overloadedDemo.test(123.25);
        System.out.println("Result of overloadedDemo.test(123.25): "+ result);

    }
}
