package com.ChainOfResponsibility;

public class HttpRequest {
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private String username;
    private String password;


    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }



}
