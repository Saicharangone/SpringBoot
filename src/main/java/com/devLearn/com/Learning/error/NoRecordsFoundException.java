package com.devLearn.com.Learning.error;

public class NoRecordsFoundException extends  Exception{
    public NoRecordsFoundException() {
        super();
    }

    public NoRecordsFoundException(String message) {
        super(message);
    }

    public NoRecordsFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoRecordsFoundException(Throwable cause) {
        super(cause);
    }

    protected NoRecordsFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
