package aCloserLookAtMethodsAndClasses.recursion;

public class RecTest {
    int[] values;

    RecTest(int n){
        values = new int[n];
    }

    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("["+ (i-1) +"] "+ values[i-1] );
    }
}
