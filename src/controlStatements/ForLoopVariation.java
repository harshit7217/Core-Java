package controlStatements;

public class ForLoopVariation {
    public static void main(String[] args) {
        boolean check = false;
        int i=0;
        for(; !check; ){
            System.out.println("i = "+ i++);
            if(i == 10) check = true;
        }
    }
}
