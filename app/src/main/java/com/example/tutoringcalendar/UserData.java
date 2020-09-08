package com.example.tutoringcalendar;

public class UserData {
    String email;
    String name;

    public UserData(String email, String name) {
        this.email = email;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public UserData(String email) {
        this.email = email;
    }
}
