package com.ChainOfResponsibility;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logging");
        return false;
    }
}
