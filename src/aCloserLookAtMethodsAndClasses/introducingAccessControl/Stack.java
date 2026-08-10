package aCloserLookAtMethodsAndClasses.introducingAccessControl;

public class Stack {
    private int[] stk = new int[10];
    private int tos;

//    Initializing top-of-stack
    Stack() {
        tos = -1;
    }

//    Push an item onto the stack
    void push(int item){
        if(tos == 9)
            System.out.println("Stack is full");
        else
            stk[++tos] = item;
    }

//    Pop an item into the stack
    int pop() {
        if(tos == -1){
            System.out.println("Stack is underflow");
            return 0;
        }else {
            return stk[tos--];
        }
    }
}
