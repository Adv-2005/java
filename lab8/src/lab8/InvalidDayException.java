package lab8;

class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Month
class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}
