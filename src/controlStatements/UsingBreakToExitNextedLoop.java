package controlStatements;

public class UsingBreakToExitNextedLoop {
    public static void main(String[] args) {
        outer : for(int i=5; i<10; i++){
            System.out.print("Pass "+ (i - 4) + " : ");
            for(int j=0; j<i; j++){
                System.out.print(j+ " ");
                if(j == 7) break outer;
            }
            System.out.println();
        }
    }
}
