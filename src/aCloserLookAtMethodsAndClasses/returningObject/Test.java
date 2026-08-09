package aCloserLookAtMethodsAndClasses.returningObject;

public class Test {
    int a;

    Test(int a){
        this.a = a;
    }

    Test incByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }
}
