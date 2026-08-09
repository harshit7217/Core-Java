package aCloserLookAtMethodsAndClasses.aCloserLookedAtArgumentPassing;

public class CallByValue {
    public static void main(String[] args) {
        PrimitiveTest ob = new PrimitiveTest();

        int a = 15, b= 20;

        System.out.println("a and b before call: "+ a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: "+ a + " "+ b);
    }
}
