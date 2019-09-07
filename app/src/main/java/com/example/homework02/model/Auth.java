package com.example.homework02.model;

public class Auth {

    private static final String EMAIL = "snowsnowaum01@gmail.com";
    private static final String PASSWORD = "snowsnowaum1";
    private String nEmail;
    private String nPassword;

    /*public void setnEmail(String email) {
        this.nEmail = email;
    }

    public void setnPassword(String password) {
        this.nPassword = password;
    }

    public String getnEmail() {
        return nEmail;
    }

    public String getnPassword() {
        return nPassword;
    }*/

    public boolean check(){
        if(nEmail.equals(EMAIL)&&nPassword.equals(PASSWORD)){
            return true;
        }else{
            return false;
        }
    }

    public Auth(String nEmail, String nPassword) {
        this.nEmail = nEmail;
        this.nPassword = nPassword;
    }
}
