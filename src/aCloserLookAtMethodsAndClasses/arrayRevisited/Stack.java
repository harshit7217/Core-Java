package aCloserLookAtMethodsAndClasses.arrayRevisited;

public class Stack {
    private int[] stk;
    private int tos;

    Stack(int size) {
        stk = new int[size];
        tos = -1;
    }

    Stack() {
        stk = new int[10];
        tos = -1;
    }

    void push(int item) {
        if(tos == stk.length-1)
            System.out.println("Stack is Overflow");
        else
            stk[++tos] = item;
    }

    int pop() {
        if(tos < 0)
            System.out.println("Stack is Underflow");
        return stk[tos--];
    }
}
