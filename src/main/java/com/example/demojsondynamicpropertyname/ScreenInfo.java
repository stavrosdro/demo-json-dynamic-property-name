package com.example.demojsondynamicpropertyname;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class ScreenInfo {

    private String id;
    private String title;
    private int width;
    private int height;
    private Map<String, Object> otherInfo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @JsonAnySetter
    public void addOtherInfo(String propertyKey, Object value) {
        if (this.otherInfo == null) {
            this.otherInfo = new HashMap<>();
        }
        this.otherInfo.put(propertyKey, value);
    }

    @Override
    public String toString() {
        return "ScreenInfo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", otherInfo=" + otherInfo +
                '}';
    }
}
