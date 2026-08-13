package aCloserLookAtMethodsAndClasses.varargs;

public class VaTest {
    static void vaTest(int ... v){
        System.out.println("Element: "+ v.length +" Content: ");

        for(int x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.println("Element: "+ v.length +" Content: ");

        for(boolean x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10, 20, 30);
        vaTest(true, false, true);
        vaTest(100);
    }
}
