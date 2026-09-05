package inheritance.overriding;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.mySum(5,10));

        AdvanceCalculator cal2 = new AdvanceCalculator();
        System.out.println(cal2.mySum(5,10));

        Calculator cal3 = new AdvanceCalculator();
        System.out.println(cal3.mySum(5,10));
    }
}
