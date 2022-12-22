package br.com.adrianomenezes.payrollapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }

}
