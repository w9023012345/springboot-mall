package com.kujudy.springbootmall.model;

import java.util.Date;

public class User {

    private Integer id;
    private String email;
    private String password;
    private Date cerateDate;
    private Date last_modified_date;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCerateDate() {
        return cerateDate;
    }

    public void setCerateDate(Date cerateDate) {
        this.cerateDate = cerateDate;
    }

    public Date getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(Date last_modified_date) {
        this.last_modified_date = last_modified_date;
    }
}
