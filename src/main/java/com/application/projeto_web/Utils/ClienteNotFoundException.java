package com.application.projeto_web.Utils;

public class ClienteNotFoundException extends RuntimeException {

    public ClienteNotFoundException(){
      super();
    }
    public ClienteNotFoundException(String message) {
        super(message);
    }
}
