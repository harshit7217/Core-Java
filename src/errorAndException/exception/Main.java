package errorAndException.exception;

public class Main {
//    Method that throws a user-defined expection
    static void validateAge(int age) throws AgeNotValidException{
        if(age < 18) {
            throw new AgeNotValidException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }

    static void validateMobileNumber(String number) throws MobileNumberValidate{
        if(number.length() != 10) {
            throw new MobileNumberValidate("Length of the number is not correct");
        }
        System.out.println("Number is valid");
    }

    public static void main(String[] args) {
        try {
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Built-in Exception caught: "+ e);
        }

        try {
            validateAge(16);
        }catch (AgeNotValidException e) {
            System.out.println("User - define Exception caught: "+ e);
        }

        try {
            validateMobileNumber("19348");
        }catch (MobileNumberValidate e){
            System.out.println("User - define Exception caught: "+ e);
        }
    }
}
