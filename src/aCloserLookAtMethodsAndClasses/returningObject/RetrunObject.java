package aCloserLookAtMethodsAndClasses.returningObject;

public class RetrunObject {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incByTen();

        System.out.println("ob1.a = "+ ob1.a);
        System.out.println("ob2.a = "+ ob2.a);

        ob2 = ob2.incByTen();

        System.out.println("ob2.a after second increase: "+ ob2.a);
    }
}
