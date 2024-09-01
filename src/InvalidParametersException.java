public class InvalidParametersException extends Exception {
    private static final String DEFAULT_MESSAGE = "Um ou mais argumentos são inválidos.";

    public InvalidParametersException() {
        super(DEFAULT_MESSAGE);
    }

    public InvalidParametersException(String message) {
        super(message);
    }

    public InvalidParametersException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParametersException(Throwable cause) {
        super(DEFAULT_MESSAGE, cause);
    }
}
