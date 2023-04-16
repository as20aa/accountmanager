package com.as.accountmanager.account.dao.vo;

import java.io.Serializable;

/***
 * AccountVO
 * @date 20230416
 * @author as
 * @version 1
 */
public class AccountVO implements Serializable {
    private String ID;
    private String Name;
    private String Phone;
    private String Sex;
    private String Mail;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}
