package exceptions;

public class ErrorInfoException extends AssertionError{

    /**
     * Excepción personalizada para proporcionar información detallada sobre un error o excepción.
     * Se utiliza para capturar y manejar errores con mensajes descriptivos, y se puede instanciar
     * en cualquier clase para evitar la necesidad de múltiples excepciones, lo que ahorra código.
     */
    public ErrorInfoException(String message, Throwable cause) {

        super(message, cause);
    }
}
