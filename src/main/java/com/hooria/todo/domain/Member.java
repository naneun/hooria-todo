package com.hooria.todo.domain;

import lombok.*;

@Getter
@Setter
public class Member {

    private long id;
    private String userId;
    private String name;
    private String password;

    public Member() {

    }

    public Member(long id, String userId, String name, String password) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.password = password;
    }
}
