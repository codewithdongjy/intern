package com.system.registeration.intern.bean;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer groupid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
}