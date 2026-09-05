package inheritance.overriding;

public class AdvanceCalculator extends Calculator {
    @Override
    public int mySum(int a, int b) {
        return a+b+10;
    }
}
