package controlStatements;

public class MultidimensionalArrayIterationUsingForEach {
    public static void main(String[] args) {
        int[][] nums = new int[3][5];

//        Initailzing the value into two dimensional array
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                nums[i][j] = (i+1) * (j+1);
            }
        }

        int sum = 0;

//        Iteration of the 2-D Array
        for(int[] x : nums){
            System.out.print("[ ");
            for(int y : x){
                sum += y;
                System.out.print(y +" ");
            }
            System.out.print("]");
            System.out.println();
        }

        System.out.println("Sum = "+ sum);
    }
}
