package aCloserLookAtMethodsAndClasses.aCloserLookedAtArgumentPassing;

public class CallByReference {
    public static void main(String[] args) {
        NonPrimitiveTest ob = new NonPrimitiveTest(15, 20);

        System.out.println("a and b before call: "+ ob.a +" "+ ob.b);

        ob.meth(ob);

        System.out.println("a and b after call: "+ ob.a +" "+ ob.b);
    }
}
