package controlStatements;

import java.io.IOException;

public class DoWhileMenu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            System.out.println("choose one:");
            choice =(char) System.in.read();
        }while(choice < '1' || choice > '5');

        System.out.println();

        switch(choice){
            case '1':
                System.out.println("The If:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The Switch: \n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant: ");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("    //...");
                break;
            case '3':
                System.out.println("The While:\n");
                System.out.println("while(condition) statement");
                break;
            case '4':
                System.out.println("The DoWhile: \n");
                System.out.println("do {");
                System.out.println("    statements;");
                System.out.println("} while(condition);");
                break;
            case '5':
                System.out.println("The For: \n");
                System.out.println("for(init; condition; iteration)");
                System.out.println("    statement");
                break;
        }
    }
}
