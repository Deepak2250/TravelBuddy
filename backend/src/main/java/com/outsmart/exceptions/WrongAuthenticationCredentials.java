package com.outsmart.exceptions;
public class WrongAuthenticationCredentials extends RuntimeException {

    private static final long serialVersionUID = 3489985341011675203L;

    public WrongAuthenticationCredentials(String message) {
        super(message);
    }

}
