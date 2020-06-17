package com.bkav.models;

public class Management {
    public boolean checkUser(String username, String password) {
        if (username.equals("HuyNg") && password.equals("HuyNG"))
            return true;
        else
            return false;
    }
}
