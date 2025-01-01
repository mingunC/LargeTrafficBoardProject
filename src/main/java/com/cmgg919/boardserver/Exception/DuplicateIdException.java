package com.cmgg919.boardserver.Exception;

public class DuplicateIdException extends RuntimeException{

    public DuplicateIdException(String msg) {
        super(msg);
    }
}
