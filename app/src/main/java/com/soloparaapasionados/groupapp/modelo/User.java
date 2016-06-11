package com.soloparaapasionados.groupapp.modelo;

import java.util.Date;

/**
 * Created by USUARIO on 28/05/2016.
 */
public class User {

    public Long UserID;
    public String Mail;
    public String Password;
    public String FirstName;
    public String LastName;
    public String Birthday = new String();
    //public Date Birthday = new Date();
    public String Cellphone;
    public String Code;

    public User(){

    }
    public User(Long userID,String mail,String password,String firstName,String lastName,String birthday,String cellphone, String code ) {
        this.UserID=userID;
        this.Mail=mail;
        this.Password=password;
        this.FirstName=firstName;
        this.LastName=lastName;
        this.Birthday=birthday;
        this.Cellphone=cellphone;
        this.Code=code;
    }
    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String cellphone) {
        Cellphone = cellphone;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }


}
