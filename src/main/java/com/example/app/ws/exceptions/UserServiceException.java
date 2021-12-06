package com.example.app.ws.exceptions;

import java.io.Serial;

public class UserServiceException extends RuntimeException{


    @Serial
    private static final long serialVersionUID = 5059466654962912096L;

    public UserServiceException(String message){
        super(message);
    }
}
