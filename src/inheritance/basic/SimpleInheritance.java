package inheritance.basic;

public class SimpleInheritance {
    public static void main(String[] args) {
//        Calling Superclass
        var superObj = new A();

        superObj.i = 10;
        superObj.j = 20;
        System.out.println("Content of Super Object: ");
        superObj.showIJ();
        System.out.println();

        var subObj = new B();
        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("Content os Sub Object: ");
        subObj.showIJ();
        subObj.showK();
        System.out.println();

        System.out.println("Sum : ");
        subObj.sum();
    }
}
