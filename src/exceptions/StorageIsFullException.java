package exceptions;

public class StorageIsFullException extends Throwable {
    public StorageIsFullException() {
    }

    public StorageIsFullException(String message) {
        super(message);
    }

    public StorageIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullException(Throwable cause) {
        super(cause);
    }

    public StorageIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
