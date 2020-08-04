package com.ChainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }
}
