package com.hooria.todo.domain;

import lombok.*;

@Getter
@AllArgsConstructor
public class Member {

    private long id;
    private String userId;
    private String password;
    private String name;
}
