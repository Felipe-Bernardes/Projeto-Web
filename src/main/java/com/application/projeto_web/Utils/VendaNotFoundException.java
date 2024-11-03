package com.application.projeto_web.Utils;

public class VendaNotFoundException extends RuntimeException {
    public VendaNotFoundException(){
        super();
    }
    public VendaNotFoundException(String message) {
        super(message);
    }
}
