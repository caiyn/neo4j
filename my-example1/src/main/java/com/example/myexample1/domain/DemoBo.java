package com.example.myexample1.domain;

import com.example.myexample1.annotation.DemoAnnotation;

public class DemoBo {

    @DemoAnnotation(username = "bb")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
