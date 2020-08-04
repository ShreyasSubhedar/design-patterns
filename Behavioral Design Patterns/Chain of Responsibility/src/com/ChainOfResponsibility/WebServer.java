package com.ChainOfResponsibility;

public class WebServer {
    private  Handler handle;
    public  WebServer(Handler handle){
        this.handle=handle;
    }
    public void handle(HttpRequest request){
        // Authenticcation
        // Logging
        // Compressor
        handle.handle(request);
    }
}
