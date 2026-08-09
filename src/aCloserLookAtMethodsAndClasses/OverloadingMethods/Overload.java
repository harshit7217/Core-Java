package aCloserLookAtMethodsAndClasses.OverloadingMethods;

public class Overload {
    public static void main(String[] args) {
        OverloadedDemo overloadedDemo = new OverloadedDemo();
        int i = 99;
//        call all the version of test(0
        overloadedDemo.test();
        overloadedDemo.test(10);
        overloadedDemo.test(10, 20);
        double firstResult = overloadedDemo.mainTest(i);
        double result = overloadedDemo.test(123.25);
        System.out.println("Result of overloadedDemo.test(123.25): "+ result);
        System.out.println("Result of overloadedDemo.test(99): "+ firstResult);

    }
}
