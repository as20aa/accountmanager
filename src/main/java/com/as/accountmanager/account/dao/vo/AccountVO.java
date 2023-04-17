package com.as.accountmanager.account.dao.vo;

import java.io.Serializable;

/***
 * AccountVO
 * @date 20230416
 * @author as
 * @version 1.1
 */
public class AccountVO implements Serializable {
    private String ID;
    private String Name;
    private String Phone;
    private String IndSex;
    private String Mail;
    private String IndStatus;

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

    public String getIndSex() {
        return IndSex;
    }

    public void setIndSex(String indSex) {
        IndSex = indSex;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getIndStatus() {
        return IndStatus;
    }

    public void setIndStatus(String indStatus) {
        IndStatus = indStatus;
    }
}
