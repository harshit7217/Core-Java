package errorAndException.exception;

public class AgeNotValidException extends Exception{
    AgeNotValidException(String message) {
        super(message);
    }
}
