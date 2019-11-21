package com.example.demojsondynamicpropertyname;

import java.util.List;

public class Test {

    private String name;
    private List<Element> value;

    public Test() {
    }

    public Test(String name, List<Element> value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Element> getValue() {
        return value;
    }

    public void setValue(List<Element> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
