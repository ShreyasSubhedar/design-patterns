package com.ChainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        if (request.getUsername()=="admin"&&request.getPassword()=="1234")
        return false;
        return true;
    }
}
