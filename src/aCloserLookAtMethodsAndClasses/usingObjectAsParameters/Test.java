package aCloserLookAtMethodsAndClasses.usingObjectAsParameters;

public class Test {
    int a, b;

    Test(int a, int b){
        this.a = a;
        this.b = b;
    }

//    return true if o is equal to the invoking objects
    boolean equalTo(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
