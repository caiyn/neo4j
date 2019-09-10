package com.example.myexample1.domain;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;

public class Dog {
    @Id
    private Long id;

    @Property(name = "nick_name")
    private String nickName;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }
}
