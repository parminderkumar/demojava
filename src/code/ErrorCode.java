package code;

/**
 * @author Parminder
 */
public enum ErrorCode {
    INVALID_INPUT(1001, "Invalid input provided"),
    USER_NOT_FOUND(1002, "User not found"),
    PERMISSION_DENIED(1003, "Permission denied"),
    SERVER_ERROR(1004, "Internal server error");

    private final int code;
    private final String message;

    // Constructor to initialize the enum constants
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // Getter methods
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}