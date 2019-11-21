package com.example.demojsondynamicpropertyname;

public class Element {

    private boolean active;
    private String fname;

    public Element() {
        this.active = true;
        this.fname = "test-name-1";
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
