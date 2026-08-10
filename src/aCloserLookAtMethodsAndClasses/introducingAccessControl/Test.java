package aCloserLookAtMethodsAndClasses.introducingAccessControl;

public class Test {
    int a; //default access
    public int b; //public access
    private int c; //private access

//    method to access c
    void setC(int c){ // set c's value
        this.c = c;
    }

//    get c's value
    int getC() {
        return c;
    }

}
