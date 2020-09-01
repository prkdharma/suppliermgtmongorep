package com.dxctraining.mongoexperiments.suppliermgt.exceptions;

public class InvalidArgumentException extends RuntimeException{

    public InvalidArgumentException(String msg){
        super(msg);
    }

}