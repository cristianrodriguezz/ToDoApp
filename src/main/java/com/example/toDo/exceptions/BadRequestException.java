package com.example.toDo.exceptions;

public class BadRequestException extends Exception {
    public BadRequestException(String mensaje) {
        super(mensaje);
    }
}