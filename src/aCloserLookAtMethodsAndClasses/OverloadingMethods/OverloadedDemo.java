package aCloserLookAtMethodsAndClasses.OverloadingMethods;

public class OverloadedDemo {
    void test() {
        System.out.println("No Parameters");
    }

//    Overloaded test for one integer parameters
    void test(int a){
        System.out.println("a: "+ a);
    }

//    Overloaded test for two integer parameters
    void test(int a, int b){
        System.out.println("a and b: "+ a + " "+ b);
    }

//    Overloaded test for a double parameters
    double test(double a){
        System.out.println("double a : "+ a);
        return a * a;
    }

    double mainTest(double a){
        System.out.println("double a: "+ a);
        return a * a;
    }
}
