package com.beyondid.utils;

public class GlobalException extends RuntimeException {
    public GlobalException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
