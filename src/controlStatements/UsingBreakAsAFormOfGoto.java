package controlStatements;

public class UsingBreakAsAFormOfGoto {
    public static void main(String[] args) {
        var t = true;

        first: {
            second : {
                third : {
                    System.out.println("Before the break statement");
                    if(t) break second;;
                    System.out.println("Not executing");
                }
                System.out.println("not executing");
            }
            System.out.println("After break statement");
        }
    }
}
