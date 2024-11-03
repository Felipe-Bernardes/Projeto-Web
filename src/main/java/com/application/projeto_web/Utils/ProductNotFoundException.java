package com.application.projeto_web.Utils;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(){
        super();
    }
    public ProductNotFoundException(String message) {
        super(message);
    }
}
