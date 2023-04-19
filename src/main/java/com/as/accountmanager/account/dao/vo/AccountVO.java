package com.as.accountmanager.account.dao.vo;

import java.io.Serializable;

/***
 * AccountVO
 * @date 20230416
 * @author as
 * @version 1.1
 * @Description you must use the lower camel case name the properties
 * to make it able to convert from json to vo class automatic
 */
public class AccountVO implements Serializable {
    private String id;
    private String name;

    private String passWord;
    private String phone;
    private String indSex;
    private String mail;
    private String indStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public String getIndSex() {
        return indSex;
    }

    public void setIndSex(String indSex) {
        this.indSex = indSex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIndStatus() {
        return indStatus;
    }

    public void setIndStatus(String indStatus) {
        this.indStatus = indStatus;
    }

    @Override
    public String toString() {
        return "AccountVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + passWord + '\'' +
                ", phone='" + phone + '\'' +
                ", indSex='" + indSex + '\'' +
                ", mail='" + mail + '\'' +
                ", indStatus='" + indStatus + '\'' +
                '}';
    }
}
