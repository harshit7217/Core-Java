package controlStatements;

import java.io.IOException;

public class FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the num: \n");
        int num =(int) System.in.read();
        boolean check;

        if(num < 2)
            check = false;
        else
            check = true;

        for(int i=2; i<num; i++){
            if(num % i == 0){
                check = false;
                break;
            }
        }

        if(check)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
