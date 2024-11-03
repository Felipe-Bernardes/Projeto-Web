package com.application.projeto_web.Utils;

public class CategoriaNotFoundException extends RuntimeException{
    public CategoriaNotFoundException(){
        super();
    }

    public CategoriaNotFoundException(String message){
        super(message);
    }
}
