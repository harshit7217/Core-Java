package aCloserLookAtMethodsAndClasses.aCloserLookedAtArgumentPassing;

public class NonPrimitiveTest {
    int a, b;

    NonPrimitiveTest (int a, int b){
        this.a = a;
        this.b = b;
    }

//    pass an object
    void meth(NonPrimitiveTest o){
        o.a *= 2;
        o.b /= 2;
    }
}
