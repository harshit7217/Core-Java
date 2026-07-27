package controlStatements;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String seasson;

        if(month == 12 || month == 1 || month == 2){
            seasson = "Winter";
        }else if(month == 3 || month == 4 || month == 5){
            seasson = "Spring";
        }else if(month == 6 || month == 7 || month == 8){
            seasson = "Summer";
        }else if(month == 9 || month == 10 || month == 11){
            seasson = "Autumn";
        }else {
            seasson = "Bogus Month";
        }

        System.out.println("April is in the "+ seasson +".");

//        Improved Version
        String newSeasson;
        month = 4;
        switch(month) {
            case 12:
            case 1:
            case 2:
                newSeasson = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                newSeasson = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                newSeasson = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                newSeasson = "Autumn";
                break;
            default:
                newSeasson = "Bogus Month";
        }

        System.out.println("April is in the "+ newSeasson + ".");
    }
}
