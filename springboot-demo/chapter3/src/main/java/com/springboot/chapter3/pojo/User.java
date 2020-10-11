package com.springboot.chapter3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author KNOE
 * @date 2020-09-21 12:15
 */
@Component("user")
public class User {
    @Value("1")
    private Long id;
    @Value("${user.id}")
    private String userName;
    @Value("note_1")
    private String note;
    // alt+insert

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
