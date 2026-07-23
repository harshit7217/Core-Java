package dataVariableAndArrays;

public class Array {
    public static void main(String[] args) {
        int[] months = new int[12];

        months[0] = 31;
        months[1] = 28;
        months[2] = 31;
        months[3] = 30;
        months[4] = 31;
        months[5] = 30;
        months[6] = 31;
        months[7] = 31;
        months[8] = 30;
        months[9] = 31;
        months[10] = 30;
        months[11] = 31;

        System.out.println("April month days: " + months[3] +" days");
    }
}
