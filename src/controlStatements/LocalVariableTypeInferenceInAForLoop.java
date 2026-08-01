package controlStatements;

public class LocalVariableTypeInferenceInAForLoop {
    public static void main(String[] args) {
//        Use the type inference in the loop control variable
        for(var x = 2.5; x<50; x+=2.5)
            System.out.print(x+" ");

        System.out.println();
        int[] num = {1,2,3,4,5};

        for(var x : num){
            System.out.print(x+" ");
        }
    }
}
