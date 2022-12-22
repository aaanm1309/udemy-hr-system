package br.com.adrianomenezes.userapihr.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }

}
