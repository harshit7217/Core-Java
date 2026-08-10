package aCloserLookAtMethodsAndClasses.introducingAccessControl;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

//        These are the ok, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

//        This is not ok and will cause error
//        ob.c = 30;

//        I want to access c through its methods
        ob.setC(30);
        System.out.println("a, b and c: "+ ob.a +" "+ ob.b +" "+ ob.getC());
    }
}
